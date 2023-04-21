package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int pid;


    private String Publiser_name;





    @OneToOne(mappedBy = "publisher")
    private Book book;

    // getters and setters


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPubliser_name() {
        return Publiser_name;
    }

    public void setPubliser_name(String publiser_name) {
        Publiser_name = publiser_name;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
