package Christian.OPG_7_3;

import Christian.OPG7_2.SalesPerson;

public class SalesDriver {

    public static void main(String[] args) {
        SalesTeam salesTeam = new SalesTeam("Rødovre");
        SalesPerson pers1 = new SalesPerson("Christian", "22422112","Rødovre");
        SalesPerson pers2 = new SalesPerson("Seier", "45452112","Rødovre");
        SalesPerson pers3 = new SalesPerson("Hanzo", "25555512","Rødovre");

        pers1.setDailyAmount(1, 101);
        pers2.setDailyAmount(2, 200);
        pers3.setDailyAmount(3, 350);
        pers1.setDailyAmount(4, 700);

        salesTeam.addSalesPerson(pers1);
        salesTeam.addSalesPerson(pers2);
        salesTeam.addSalesPerson(pers3);

        salesTeam.weeklyReport();
    }
}
