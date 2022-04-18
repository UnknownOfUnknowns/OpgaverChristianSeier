package Christian.OPG4_7;



public class Book {
    private String author;
    private String publisher;
    private String copyright_date;

    public Book (String a, String p, String cd) {
        this.author = a;
        this.publisher = p;
        this.copyright_date = cd;
    }

    public String getCopyright_date() {
        return copyright_date;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a){
        this.author = a;
    }
    public void setPublisher(String p) {
        this.publisher = p;
    }
    public void setCopyright_date(String cd) {
        this.copyright_date = cd;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", copyright_date=" + copyright_date +
                '}';
    }
}
