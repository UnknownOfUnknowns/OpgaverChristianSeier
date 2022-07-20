package Christian.OPG9_3;

public class Bookdriver {
    public static void main(String[] args) {


        Novel novel = new Novel("Hans og de små programmøre", "Hans Andersen", 899, "Hans Andersen");

        novel.printbookdata();

        Magazine magazine = new Magazine("M", "Damer", 88);

        magazine.printbookdata();
    }
}