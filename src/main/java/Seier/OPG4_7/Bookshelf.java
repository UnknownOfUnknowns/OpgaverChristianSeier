package Seier.OPG4_7;

import java.time.LocalDate;
import java.util.Date;

public class Bookshelf {

    public static void main(String[] args) {

        Book book = new Book("Blinkende Lygter", "Ove Ditlevsen", "DanishFilms", LocalDate.now());

        System.out.println(book.toString());

    }
}
