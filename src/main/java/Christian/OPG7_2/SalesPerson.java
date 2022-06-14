package Christian.OPG7_2;

public class SalesPerson {

    private String name;
    private String phonenr;
    private String district;
    private double sale_amount, DailyAmount;
    private String monday,tuesday,wednesday,thursday,friday,saturday,sunday;

    public SalesPerson(String name, String phonenr, String district) {
        this.name = name;
        this.phonenr = phonenr;
        this.district = district;
    }
    public SalesPerson(String name, double sale_amount) {
        this.name = name;
        this.sale_amount = sale_amount;
        return;
    }

    public void setDailyAmount(double dailyAmount) {
        DailyAmount = dailyAmount;
    }
}
