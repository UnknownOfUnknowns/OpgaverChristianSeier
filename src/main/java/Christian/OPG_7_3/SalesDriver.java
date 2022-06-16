package Christian.OPG_7_3;

import Christian.OPG7_2.SalesPerson;

public class SalesDriver {

    public static void main(String[] args) {
        SalesTeam rødovre = new SalesTeam("Rødovre");
        SalesTeam solrød = new SalesTeam("Solrød");
        SalesTeam hundige = new SalesTeam("Hundige");
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

        rødovre.addSalesPerson(pers1);
        solrød.addSalesPerson(pers2);
        hundige.addSalesPerson(pers3);
        rødovre.addSalesPerson(pers4);
        rødovre.addSalesPerson(pers5);

        pers4.setDailyAmount(5,250);
        pers5.setDailyAmount(6, 45);

        solrød.addSalesPerson(pers6);

        pers6.setDailyAmount(0, 150);

        rødovre.weeklyReport();
        solrød.weeklyReport();
        hundige.weeklyReport();
    }
}
