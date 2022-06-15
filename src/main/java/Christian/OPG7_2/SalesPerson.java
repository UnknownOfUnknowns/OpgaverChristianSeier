package Christian.OPG7_2;



import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;

public class SalesPerson {

    private String name;
    private String phonenr;
    private String district;
    private double[] sale_amount;



    public SalesPerson(String name, String phonenr, String district, double[] sale_amount) {
        this.name = name;
        this.phonenr = phonenr;
        this.district = district;
        this.sale_amount = sale_amount;
    }

    public SalesPerson(String name, String phonenr, String district) {
        this.name = name;
        this.phonenr = phonenr;
        this.district = district;
        this.sale_amount = new double[7];
    }

    public void setDailyAmount(int day, double amount) {
        sale_amount[day] = amount;
    }

    public double getDailyAmount(int day) {
      return sale_amount[day];
    }

    public double total() {
        double weekly_amount = 0;
        for (int i = 0; i < sale_amount.length; i++) {
            weekly_amount += sale_amount[i];
        }
        return weekly_amount;
    }

    public double average() {
        return total()/7;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name='" + name + '\'' +
                ", phonenr='" + phonenr + '\'' +
                ", district='" + district + '\'' +
                ", sale_amount=" + Arrays.toString(sale_amount) +
                '}';
    }
}

