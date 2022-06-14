package Christian.OPG7_2;



import java.time.DayOfWeek;
import java.util.ArrayList;

public class SalesPerson {

    private String name;
    private String phonenr;
    private String district;
    private double sale_amount, DailyAmount;




    public SalesPerson(String name, String phonenr, String district) {
        this.name = name;
        this.phonenr = phonenr;
        this.district = district;
    }
    public SalesPerson(String name, double sale_amount) {
        this.name = name;
        this.sale_amount = sale_amount;

    }

    public enum DayOfTheWeek {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }


}

