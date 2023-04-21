package web;
import dao.DaoImpl;
import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("BOOK MANAGEMENT SYSTEM");

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DaoImpl daomimpl= new DaoImpl();
        Book book = new  Book();
        Author author = new Author();
        Publisher publisher = new Publisher();


        boolean flag = true;
        while (flag) {

            System.out.println("1.Insert Book ");
            System.out.println("2. Insert Author");
            System.out.println("3. Inser Publisher ");
            System.out.println("4. Add Book, Author , Publisher parallelly");
           System.out.println("5. delete Book ");
            System.out.println("6. Update Book");
           System.out.println("7. Query 2 ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    daomimpl.insertBook(book);
                    break;
                case 2:
                    daomimpl.insertAuthor(author);
                    break;
                case 3:
                    daomimpl.insertPubliser(publisher);
                    break;
                case 4:
                    daomimpl.insertBookandstudentNumber();
                    break;
                case 5:
                    System.out.println("Enter Book Id");
                    daomimpl.deletebook(Integer.parseInt(br.readLine()));
                    break;
                case 6:
                    System.out.println("Enter Author Id");
                    daomimpl.updateAuthor(Integer.parseInt(br.readLine()));
                    break;
                case 7:
                   daomimpl.niralipublicationBook();
                    break;
                case 8:
                    daomimpl.retiveBooks();

                    break;
                case 9:
                    daomimpl.retiveLike();

                    break;
                case 0:
                    flag = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
7
Hibernate: select book0_.Bid as bid1_1_0_, author1_.Autid as autid1_0_1_, publisher2_.pid as pid1_2_2_, book0_.Publiser_date as publiser2_1_0_, book0_.author_Autid as author_a5_1_0_, book0_.price as price3_1_0_, book0_.publisher_pid as publishe6_1_0_, book0_.title as title4_1_0_, author1_.name as name2_0_1_, publisher2_.Publiser_name as publiser2_2_2_ from Book book0_ inner join authors author1_ on book0_.author_Autid=author1_.Autid inner join publishers publisher2_ on book0_.publisher_pid=publisher2_.pid
Book ID: 1
Book Name: Ramayan
Author Name: Anjali
Publication Name: Nirali
Book Price: 200
----------------------
Book ID: 2
Book Name: Mahabhart
Author Name: Anjali
Publication Name: Nirali
Book Price: 600
----------------------
Book ID: 3
Book Name: Bhagvatgeeta
Author Name: Anjali
Publication Name: Nirali
Book Price: 300
----------------------
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 

Process finished with exit code 130
CRUD Done No NULL VALUES and one query done
