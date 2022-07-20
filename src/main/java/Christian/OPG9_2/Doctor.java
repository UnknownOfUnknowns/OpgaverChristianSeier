package Christian.OPG9_2;

public class Doctor extends Employees{
    public Doctor(String name) {
        super(name, "Doctor");
    }

    public void service() {
        System.out.println(name + " is a really good Doctor");
    }
}
