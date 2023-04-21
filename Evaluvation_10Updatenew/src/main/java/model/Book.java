package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;


@Entity


public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Bid;

    private String title;

    private String price;

    @ManyToOne
    private Author author;

    @OneToOne
    private Publisher publisher;

    private int Publiser_date;

    // getters and setters


    public void setPubliser_date(int publiser_date) {
        Publiser_date = publiser_date;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int bid) {
        Bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
