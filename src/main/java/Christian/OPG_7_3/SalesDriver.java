package Christian.OPG_7_3;

import Christian.OPG7_2.SalesPerson;

public class SalesDriver {

    public static void main(String[] args) {
        SalesTeam salesTeam = new SalesTeam("Rødovre");
        SalesTeam salesTeam1 = new SalesTeam("Solrød");
        SalesTeam salesTeam2 = new SalesTeam("Hundige");
        SalesPerson pers1 = new SalesPerson("Christian", "22422112","Rødovre");
        SalesPerson pers2 = new SalesPerson("Seier", "45452112","Solrød");
        SalesPerson pers3 = new SalesPerson("Hanzo", "25555512","Hundige");
        SalesPerson pers4 = new SalesPerson("Hanibal", "21444444", "Rødovre");
        SalesPerson pers5 = new SalesPerson("Mogens", "21212112", "rødovre");
        SalesPerson pers6 = new SalesPerson("Peter", "45457487", "Solrød");

        pers1.setDailyAmount(1, 101);
        pers2.setDailyAmount(2, 200);
        pers3.setDailyAmount(3, 350);
        pers1.setDailyAmount(4, 700);

        salesTeam.addSalesPerson(pers1);
        salesTeam1.addSalesPerson(pers2);
        salesTeam2.addSalesPerson(pers3);
        salesTeam.addSalesPerson(pers4);
        salesTeam.addSalesPerson(pers5);

        pers4.setDailyAmount(5,250);
        pers5.setDailyAmount(6, 45);

        salesTeam1.addSalesPerson(pers6);

        pers6.setDailyAmount(0, 150);

        salesTeam.weeklyReport();
        salesTeam1.weeklyReport();
        salesTeam2.weeklyReport();
    }
}
