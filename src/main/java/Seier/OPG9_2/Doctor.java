package Seier.OPG9_2;

public class Doctor extends Employee{

    public Doctor(String name) {
        super(name,"Doctor");

    }

    public void service(){

        System.out.println(name + " will help you out!");
    }

}
