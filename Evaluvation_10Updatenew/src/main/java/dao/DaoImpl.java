package dao;

import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoImpl implements Dao {
    private static final Configuration CONFIGURATION = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(Book.class).addAnnotatedClass(Author.class).addAnnotatedClass(Publisher.class);
    private static final SessionFactory SESSION_FACTORY = CONFIGURATION.buildSessionFactory();


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void insertBookandstudentNumber() throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Enter Author Id in which you when add book ");
        int userFetchId = Integer.parseInt(br.readLine());
        Author user = session.get(Author.class, userFetchId);

        List<Book> productList = new ArrayList<>();
        System.out.println("Enter Number Books to add ");
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {

            System.out.println("Enter  Book Id ");
            System.out.println("Enter  Publisher Id ");
            int bid = Integer.parseInt(br.readLine());
            int pid = Integer.parseInt(br.readLine());

            Book book1 = session.get(Book.class, bid);
            Publisher publisher = session.get(Publisher.class, pid);

            book1.setAuthor(user);
            book1.setPublisher(publisher);

            productList.add(book1);
            session.save(book1);

        }
        System.out.println("Add in list");
        user.setBooks(productList);
        session.save(user);

        transaction.commit();
        session.close();

    }

    public void insertBook(Book book) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Book name");
        book.setTitle(br.readLine());

        System.out.println("Enter Book price");
        book.setPrice(br.readLine());

        System.out.println("Enter Book Published date");
        book.setPubliser_date(Integer.parseInt(br.readLine()));


        session.save(book);

        transaction.commit();
        session.close();


    }


    public void insertAuthor(Author author) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Author name:");
        author.setName(br.readLine());


        session.save(author);

        transaction.commit();
        session.close();
        System.out.println("Author added  successfully!");
    }

    public void insertPubliser(Publisher publisher) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Publiser name:");
        publisher.setPubliser_name(br.readLine());

        session.save(publisher);

        transaction.commit();
        session.close();
        System.out.println("Publisher inserted!");
    }

    public List<String> getAuthorsPublishedBefore2021() {
        Session session = SESSION_FACTORY.openSession();
        Transaction tx = null;
        List<String> results = null;

        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("SELECT DISTINCT a.name FROM Author a JOIN a.books b WHERE b.Publiser_date < 2021");
            results = query.getResultList();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

    public void updateAuthor(int sid) throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        Author student = session.get(Author.class, sid);

        System.out.println("Enter Author name you want to update");
        String name = br.readLine();

        student.setName(name);

        session.save(student);
        transaction.commit();
        session.close();

        System.out.println("Author updated successfully!");
    }

    public boolean deletebook(int id) throws SQLException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Book book = session.get(Book.class, id);
        if (book != null) {
            session.delete(book);
            transaction.commit();
            session.close();
            return true;
        }
        return false;
    }

    public List<Object[]> selectQuery() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "SELECT b.id, b.title, b.price, b.publisher.name model.FROM Book b WHERE b.publisher.pid = :publisherId AND b.price >= :price";
        Query<Object[]> query = session.createQuery(hql, Object[].class);
        query.setParameter("publisherId", 1);
        query.setParameter("price", 500);
        List<Object[]> results = query.getResultList();

        transaction.commit();
        session.close();
        return results;
    }

    public void niralipublicationBook() {
        Session session = SESSION_FACTORY.openSession();
        Transaction tx = session.beginTransaction();
        String hqls = "select b.*from book b join authors a on b.author_Autid = a.Autid;";


        List<Book> books = session.createQuery("FROM Book b JOIN FETCH b.author JOIN FETCH b.publisher", Book.class).getResultList();



        if (books.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : books) {
                System.out.println("Book ID: " + book.getBid());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Author Name: " + book.getAuthor().getName());
                System.out.println("Publication Name: " + book.getPublisher().getPubliser_name());
                System.out.println("Book Price: " + book.getPrice());
                System.out.println("----------------------");
            }
        }
        session.close();
    }

    public  void retiveLike(){
        Session session = SESSION_FACTORY.openSession();
        Transaction tx = session.beginTransaction();
         String hq = "SELECT b FROM Author a INNER JOIN a.book b WHERE a.name LIKE 'A%I'";

        Query query = session.createQuery(hq,Book.class);
        query.setParameter("pid", 1);
        query.setParameter("price", 500);
        List<Book> bookList = query.getResultList();

        if (bookList.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : bookList) {
                System.out.println("Book ID: " + book.getBid());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Author Name: " + book.getAuthor().getName());
                System.out.println("Publication Name: " + book.getPublisher().getPubliser_name());
                System.out.println("Book Price: " + book.getPrice());
                System.out.println("----------------------");
            }
        }
        session.close();
    }
    public  void retiveBooks(){
        Session session = SESSION_FACTORY.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "SELECT b.title" +
                "FROM book b" +
                "JOIN authors a ON b.author_Autid = a.Autid" +
                "WHERE a.name LIKE 'A%I';";

        Query query = session.createQuery(hql,Book.class);


        List<Book> bookList = query.getResultList();

        if (bookList.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : bookList) {
                System.out.println("Book ID: " + book.getBid());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Author Name: " + book.getAuthor().getName());
                System.out.println("Publication Name: " + book.getPublisher().getPubliser_name());
                System.out.println("Book Price: " + book.getPrice());
                System.out.println("----------------------");
            }
        }
        session.close();
    }


    }


