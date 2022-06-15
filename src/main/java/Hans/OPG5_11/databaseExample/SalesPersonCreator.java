package Hans.OPG5_11.databaseExample;

import Christian.OPG7_2.SalesPerson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalesPersonCreator {
    public static void main(String[] args) throws SQLException {
        for(SalesPerson salesPerson : createSalesPersons())
         System.out.println(salesPerson);
    }
    private static ArrayList<SalesPerson> createSalesPersons() throws SQLException {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();

        ArrayList<SalesPerson> salesPersons = new ArrayList<>();

        String getPersons = "SELECT * FROM SalesPerson";
        //Som at skrive sit query i MySql Workbench
        PreparedStatement ps = connection.prepareStatement(getPersons);
        //Som at trykke ctrl+enter
        ResultSet rs = ps.executeQuery();
        //Kør over hvert entry i den tabel vi får tilbage
        while(rs.next()){
            salesPersons.add(new SalesPerson(rs.getString(1), rs.getString(2), rs.getString(3)));
        }

        String getSales = "SELECT day, ammount FROM sales WHERE name = ?";

        ps = connection.prepareStatement(getSales);

        for(SalesPerson person : salesPersons){
            ps.setString(1, person.getName());
            rs = ps.executeQuery();
            while(rs.next()){
                person.setDailyAmount(rs.getInt("day"), rs.getInt("ammount"));
            }
        }

        return salesPersons;
    }
}
