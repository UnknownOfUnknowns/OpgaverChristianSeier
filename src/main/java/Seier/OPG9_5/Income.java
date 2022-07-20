package Seier.OPG9_5;

public class Income extends DataAnalysis {

   private double work_income;
  private double gov_income;
   private double tax_returns;


    public Income(String nationality, String occupation, String sex, int age, double income, double work_income, double gov_income, double tax_returns){
        super(nationality, occupation, sex, age, income);
       this.gov_income = gov_income;
       this.work_income = work_income;
       this.tax_returns = tax_returns;


    }

    public double getwork_income() {
        return work_income;
    }
    public void setwork_income(double work_income) {
        this.work_income=work_income;
    }

    public double getgov_income() {
        return gov_income;
    }
    public void setgov_income(double gov_income) {
        this.gov_income=gov_income;
    }

    public double gettax_returns() {
        return tax_returns;
    }
    public void settax_returns(double tax_returns) {
        this.tax_returns=tax_returns;
    }

    public double taxpay(double tax_returns) {
        this.tax_returns = tax_returns;
        return this.tax_returns*0.8;
    }


    @Override
    public String toString() {
        return super.toString()+ "Income{" +
                "work_income=" + work_income +
                ", gov_income=" + gov_income +
                ", tax_returns=" + tax_returns +
                '}';
    }
}
