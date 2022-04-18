package Christian.OPG4_7;

import java.util.ArrayList;

public class Bookshelf {
    public static void main(String[] args) {
        ArrayList<Book> bookArrayList = new ArrayList<Book>();
        bookArrayList.add(new Book("Hans Andersen", "Gyldendal", "01-02-2022"));
        bookArrayList.add(new Book("Christian Kjeldgaard", "Gyldendal", "02-08-1994"));
        bookArrayList.add(new Book("chssj", "gjhskgn", "0204394"));

        for (Book book: bookArrayList) {
            System.out.println(book.getAuthor());
        }

    }
}
