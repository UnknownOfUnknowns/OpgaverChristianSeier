package Christian.Freestyle_Array;

public class kursDriver {

    public static void main(String[] args) {

        Aktie aktie = new Aktie();
        aktie.tilføjAktiekurs(15.5);
        aktie.tilføjAktiekurs(20.0);
        aktie.tilføjAktiekurs(1.0);
        aktie.tilføjAktiekurs(12.2);

        System.out.println(aktie.maksKurs());
        System.out.println(aktie.lavestKurs());
        System.out.println(aktie.gennemsnitsKurs());

    }
}
