package Seier.OPG7_3;

import Christian.OPG7_2.SalesPerson;

import java.util.ArrayList;

public class SalesTeam {

    String teamname;

    ArrayList<SalesPerson> teammembers = new ArrayList<>();



    public SalesTeam (String name) {

        teamname = name;


    }

   public void addSalesPerson(SalesPerson person){

       teammembers.add(person);

   }

   public void weeklyReport(){

       double weekly = 0;
       for (int i = 0; i < teammembers.size(); i++) {
           System.out.println("Medarbejder: " + teammembers.get(i).getName() + teammembers.get(i).total());
           weekly += teammembers.get(i).total();
       }

       System.out.println("Ugens: " + weekly);

   }

}
