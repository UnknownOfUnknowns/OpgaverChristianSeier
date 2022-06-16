package Seier.OPG7_3;

import Christian.OPG7_2.SalesPerson;

public class Driver {

    public static void main(String[] args) {

        SalesTeam Solrød = new SalesTeam("Solroed");

        SalesPerson Seier = new SalesPerson("Seier", "50125111", "Solroed");

        Solrød.addSalesPerson(Seier);

        Seier.setDailyAmount(0, 5);
        Seier.setDailyAmount(1, 2);
        Seier.setDailyAmount(2, 5);
        Seier.setDailyAmount(3, 4);
        Seier.setDailyAmount(4, 6);
        Seier.setDailyAmount(5, 6);
        Seier.setDailyAmount(6, 9);

        Solrød.weeklyReport();

    }


}
