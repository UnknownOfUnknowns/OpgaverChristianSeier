package Christian.OPG7_2;

public class Sales {
    public static void main(String[] args) {
        SalesPerson pers1 = new SalesPerson("Christian", "22422112","Rødovre");
        pers1.setDailyAmount(1, 1000);


        pers1.setDailyAmount(2, 120);
        pers1.setDailyAmount(3, 100);

        System.out.println(pers1.total());
        System.out.println(pers1.average());

    }
}
