package Christian.OPG9_3;

public class Books {
    String book_name, type, primary_character;
    int numbers_page;

    public Books(String book_name, String type, String primary_character, int numbers_page) {
        this.book_name = book_name;
        this.type = type;
        this.primary_character = primary_character;
        this.numbers_page = numbers_page;
    }

    public void printbookdata() {
        System.out.println(book_name + "," + type + "," + primary_character + "," + numbers_page);
    }

}
