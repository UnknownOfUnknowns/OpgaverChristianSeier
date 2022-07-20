package Christian.OPG9_3;

public class Novel extends Book {
    String author;
    public Novel(String book_name, String hovedperson, int numbers_page, String author){
        super(book_name, "Novel", hovedperson, numbers_page);
        this.author = author;
    }

    @Override
    public void printbookdata() {
        super.printbookdata();
        System.out.println(author);
    }
}
