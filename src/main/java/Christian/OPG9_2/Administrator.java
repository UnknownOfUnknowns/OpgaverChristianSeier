package Christian.OPG9_2;

public class Administrator extends Employees {
    public Administrator(String name) {
        super(name, "Administrator");
    }


    public void Admin() {
        System.out.println(name + " er admin her på hospitalet");
    }

}
