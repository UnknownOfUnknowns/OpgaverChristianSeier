package Seier.OPG4_7;

import java.time.LocalDate;
import java.util.Date;

public class Book {

    String title;
    String author;
    String publisher;
    LocalDate copyrightdate;

    // constructor

    public Book(String title, String author, String publisher, LocalDate copyrightdate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightdate = copyrightdate;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getCopyrightdate() {
        return copyrightdate;
    }

    // setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyrightdate(LocalDate copyrightdate) {
        this.copyrightdate = copyrightdate;
    }

    @Override
    public String toString() {
        return String.format("Title: " + title + "\n" + "author: " + author + "\n" + "publisher: " + publisher + "\n" + "copyrightdate: " + copyrightdate);


    }
}
