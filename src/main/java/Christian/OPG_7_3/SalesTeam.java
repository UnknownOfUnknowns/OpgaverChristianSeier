package Christian.OPG_7_3;

import Christian.OPG7_2.SalesPerson;

import java.util.ArrayList;

public class SalesTeam {

    private String teamName;
    private ArrayList<SalesPerson> salesPersons = new ArrayList<>();

    public SalesTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addSalesPerson(SalesPerson salesPerson) {
        salesPersons.add(salesPerson);
    }
    private double total() {
        double weekly_amount = 0;
        for (int i = 0; i < salesPersons.size(); i++){
            weekly_amount += salesPersons.get(i).total();
        }
        return weekly_amount;
    }

    public void weeklyReport() {
        for (SalesPerson salesPerson : salesPersons) {
            System.out.println(salesPerson.getName() + " " + salesPerson.total());
        }
        System.out.println("total for " + teamName + " districtet " + total());
    }
}
