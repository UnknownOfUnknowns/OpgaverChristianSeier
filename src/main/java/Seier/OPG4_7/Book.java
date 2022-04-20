package Seier.OPG4_7;

public class Book {

    String title;
    String author;
    String publisher;
    String copyrightdate;

    // constructor

    public Book(String title, String author, String publisher, String copyrightdate) {
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

    public String getCopyrightdate() {
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

    public void setCopyrightdate(String copyrightdate) {
        this.copyrightdate = copyrightdate;
    }

    @Override
    public String toString() {
        return String.format("Title: " + title + "\n" + "author: " + author + "\n" + "publisher: " + publisher + "\n" + "copyrightdate: " + copyrightdate);


    }
}
