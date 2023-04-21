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
