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
"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=61455:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\Evaluvation_10Updatenew\target\classes;C:\Users\Coditas\.m2\repository\org\hibernate\hibernate-core\5.6.5.Final\hibernate-core-5.6.5.Final.jar;C:\Users\Coditas\.m2\repository\org\jboss\logging\jboss-logging\3.4.3.Final\jboss-logging-3.4.3.Final.jar;C:\Users\Coditas\.m2\repository\javax\persistence\javax.persistence-api\2.2\javax.persistence-api-2.2.jar;C:\Users\Coditas\.m2\repository\net\bytebuddy\byte-buddy\1.12.7\byte-buddy-1.12.7.jar;C:\Users\Coditas\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\Coditas\.m2\repository\org\jboss\spec\javax\transaction\jboss-transaction-api_1.2_spec\1.1.1.Final\jboss-transaction-api_1.2_spec-1.1.1.Final.jar;C:\Users\Coditas\.m2\repository\org\jboss\jandex\2.4.2.Final\jandex-2.4.2.Final.jar;C:\Users\Coditas\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\Coditas\.m2\repository\javax\activation\javax.activation-api\1.2.0\javax.activation-api-1.2.0.jar;C:\Users\Coditas\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar;C:\Users\Coditas\.m2\repository\javax\xml\bind\jaxb-api\2.3.1\jaxb-api-2.3.1.jar;C:\Users\Coditas\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.1\jaxb-runtime-2.3.1.jar;C:\Users\Coditas\.m2\repository\org\glassfish\jaxb\txw2\2.3.1\txw2-2.3.1.jar;C:\Users\Coditas\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.7\istack-commons-runtime-3.0.7.jar;C:\Users\Coditas\.m2\repository\org\jvnet\staxex\stax-ex\1.8\stax-ex-1.8.jar;C:\Users\Coditas\.m2\repository\com\sun\xml\fastinfoset\FastInfoset\1.2.15\FastInfoset-1.2.15.jar;C:\Users\Coditas\.m2\repository\mysql\mysql-connector-java\8.0.28\mysql-connector-java-8.0.28.jar;C:\Users\Coditas\.m2\repository\com\google\protobuf\protobuf-java\3.11.4\protobuf-java-3.11.4.jar web.App
BOOK MANAGEMENT SYSTEM
Apr 21, 2023 4:10:09 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.5.Final
Apr 21, 2023 4:10:12 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Apr 21, 2023 4:10:14 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Apr 21, 2023 4:10:14 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/Eval10?createDatabaseIfNotExist=true]
Apr 21, 2023 4:10:14 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {password=****, user=root}
Apr 21, 2023 4:10:14 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Apr 21, 2023 4:10:14 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
Apr 21, 2023 4:10:16 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
Hibernate: drop table if exists authors
Apr 21, 2023 4:10:20 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@62b93086] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: drop table if exists Book
Hibernate: drop table if exists publishers
Hibernate: create table authors (Autid integer not null auto_increment, name varchar(255), primary key (Autid)) engine=MyISAM
Apr 21, 2023 4:10:20 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@58c1da09] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: create table Book (Bid integer not null auto_increment, Publiser_date integer not null, price varchar(255), title varchar(255), author_Autid integer, publisher_pid integer, primary key (Bid)) engine=MyISAM
Hibernate: create table publishers (pid integer not null auto_increment, Publiser_name varchar(255), primary key (pid)) engine=MyISAM
Hibernate: alter table Book add constraint FKfjgtesbh2slnymdgsoi80yaks foreign key (author_Autid) references authors (Autid)
Hibernate: alter table Book add constraint FKynb3s4jmjyqp8wigx24yr3ju foreign key (publisher_pid) references publishers (pid)
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
1
Enter Book name
Ramayan
Enter Book price
400
Enter Book Published date
2011
Hibernate: insert into Book (Publiser_date, author_Autid, price, publisher_pid, title) values (?, ?, ?, ?, ?)
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
1
Enter Book name
Mahabhart
Enter Book price
600
Enter Book Published date
2021
Hibernate: insert into Book (Publiser_date, author_Autid, price, publisher_pid, title) values (?, ?, ?, ?, ?)
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
1
Enter Book name
Bhagavatgeta
Enter Book price
200
Enter Book Published date
2019
Hibernate: insert into Book (Publiser_date, author_Autid, price, publisher_pid, title) values (?, ?, ?, ?, ?)
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
2
Enter Author name:
Anjali
Hibernate: insert into authors (name) values (?)
Author added  successfully!
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
3
Enter Publiser name:
Nirali
Hibernate: insert into publishers (Publiser_name) values (?)
Publisher inserted!
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
3
Enter Publiser name:
Techknowledge
Hibernate: insert into publishers (Publiser_name) values (?)
Publisher inserted!
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
3
Enter Publiser name:
techneo
Hibernate: insert into publishers (Publiser_name) values (?)
Publisher inserted!
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 
4
Enter Author Id in which you when add book 
1
Hibernate: select author0_.Autid as autid1_0_0_, author0_.name as name2_0_0_ from authors author0_ where author0_.Autid=?
Enter Number Books to add 
3
Enter  Book Id 
Enter  Publisher Id 
1
1
Hibernate: select book0_.Bid as bid1_1_0_, book0_.Publiser_date as publiser2_1_0_, book0_.author_Autid as author_a5_1_0_, book0_.price as price3_1_0_, book0_.publisher_pid as publishe6_1_0_, book0_.title as title4_1_0_, author1_.Autid as autid1_0_1_, author1_.name as name2_0_1_, publisher2_.pid as pid1_2_2_, publisher2_.Publiser_name as publiser2_2_2_ from Book book0_ left outer join authors author1_ on book0_.author_Autid=author1_.Autid left outer join publishers publisher2_ on book0_.publisher_pid=publisher2_.pid where book0_.Bid=?
Hibernate: select publisher0_.pid as pid1_2_0_, publisher0_.Publiser_name as publiser2_2_0_, book1_.Bid as bid1_1_1_, book1_.Publiser_date as publiser2_1_1_, book1_.author_Autid as author_a5_1_1_, book1_.price as price3_1_1_, book1_.publisher_pid as publishe6_1_1_, book1_.title as title4_1_1_, author2_.Autid as autid1_0_2_, author2_.name as name2_0_2_ from publishers publisher0_ left outer join Book book1_ on publisher0_.pid=book1_.publisher_pid left outer join authors author2_ on book1_.author_Autid=author2_.Autid where publisher0_.pid=?
Enter  Book Id 
Enter  Publisher Id 
2
2
Hibernate: select book0_.Bid as bid1_1_0_, book0_.Publiser_date as publiser2_1_0_, book0_.author_Autid as author_a5_1_0_, book0_.price as price3_1_0_, book0_.publisher_pid as publishe6_1_0_, book0_.title as title4_1_0_, author1_.Autid as autid1_0_1_, author1_.name as name2_0_1_, publisher2_.pid as pid1_2_2_, publisher2_.Publiser_name as publiser2_2_2_ from Book book0_ left outer join authors author1_ on book0_.author_Autid=author1_.Autid left outer join publishers publisher2_ on book0_.publisher_pid=publisher2_.pid where book0_.Bid=?
Hibernate: select publisher0_.pid as pid1_2_0_, publisher0_.Publiser_name as publiser2_2_0_, book1_.Bid as bid1_1_1_, book1_.Publiser_date as publiser2_1_1_, book1_.author_Autid as author_a5_1_1_, book1_.price as price3_1_1_, book1_.publisher_pid as publishe6_1_1_, book1_.title as title4_1_1_, author2_.Autid as autid1_0_2_, author2_.name as name2_0_2_ from publishers publisher0_ left outer join Book book1_ on publisher0_.pid=book1_.publisher_pid left outer join authors author2_ on book1_.author_Autid=author2_.Autid where publisher0_.pid=?
Enter  Book Id 
Enter  Publisher Id 
3
3
Hibernate: select book0_.Bid as bid1_1_0_, book0_.Publiser_date as publiser2_1_0_, book0_.author_Autid as author_a5_1_0_, book0_.price as price3_1_0_, book0_.publisher_pid as publishe6_1_0_, book0_.title as title4_1_0_, author1_.Autid as autid1_0_1_, author1_.name as name2_0_1_, publisher2_.pid as pid1_2_2_, publisher2_.Publiser_name as publiser2_2_2_ from Book book0_ left outer join authors author1_ on book0_.author_Autid=author1_.Autid left outer join publishers publisher2_ on book0_.publisher_pid=publisher2_.pid where book0_.Bid=?
Hibernate: select publisher0_.pid as pid1_2_0_, publisher0_.Publiser_name as publiser2_2_0_, book1_.Bid as bid1_1_1_, book1_.Publiser_date as publiser2_1_1_, book1_.author_Autid as author_a5_1_1_, book1_.price as price3_1_1_, book1_.publisher_pid as publishe6_1_1_, book1_.title as title4_1_1_, author2_.Autid as autid1_0_2_, author2_.name as name2_0_2_ from publishers publisher0_ left outer join Book book1_ on publisher0_.pid=book1_.publisher_pid left outer join authors author2_ on book1_.author_Autid=author2_.Autid where publisher0_.pid=?
Add in list
Hibernate: update Book set Publiser_date=?, author_Autid=?, price=?, publisher_pid=?, title=? where Bid=?
Hibernate: update Book set Publiser_date=?, author_Autid=?, price=?, publisher_pid=?, title=? where Bid=?
Hibernate: update Book set Publiser_date=?, author_Autid=?, price=?, publisher_pid=?, title=? where Bid=?
1.Insert Book 
2. Insert Author
3. Inser Publisher 
4. Add Book, Author , Publisher parallelly
5. delete Book 
6. Update Book
7. Query 2 

