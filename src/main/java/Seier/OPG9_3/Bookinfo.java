package Seier.OPG9_3;


public class Bookinfo {

    String name;
    String type;
    Integer year;

    public Bookinfo(String name, String type, Integer year) {
        this.name=name;
        this.type=type;
        this.year=year;


    }

    public void PrintBookData(){
        System.out.println(name + type + year);
    }

}
