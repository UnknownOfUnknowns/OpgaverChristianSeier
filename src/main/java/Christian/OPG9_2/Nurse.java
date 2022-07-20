package Christian.OPG9_2;

public class Nurse extends Employees {
    public Nurse(String name) {
        super(name,"Nurse");
    }

    public void nurses() {
        System.out.println(name + " er en pæn sygeplejerske");
    }

}
