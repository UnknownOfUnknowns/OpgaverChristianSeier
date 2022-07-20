package Seier.OPG9_3;

public class Book extends Bookinfo {

String genre, author;

    public Book(String name, String type, Integer year, String Genre, String Author){
        super(name, type, year);
        this.genre =Genre;
        this.author =Author;
    }

    @Override
    public void PrintBookData(){
        System.out.println(name + type + year + genre + author);
    }



}
