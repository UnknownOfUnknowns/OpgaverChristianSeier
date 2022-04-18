package Christian.OPG4_7;

public class Bookshelf {
    public static void main(String[] args) {
        Book book = new Book("Hans Andersen", "Gyldendal", "01-02-2022");

        System.out.println(book.toString());

        book.setPublisher("DTU-Biblo");
        System.out.println(book.toString());

        Book book1 = new Book("Christian Kjeldgaard", "Gyldendal", "02-08-1994");
        System.out.println(book1.toString());
        System.out.println(book.toString());
    }
}
