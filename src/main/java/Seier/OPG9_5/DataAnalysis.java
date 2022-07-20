package Seier.OPG9_5;

public class DataAnalysis {

    String nationality, occupation, sex;
    int age;
    double income;

    public DataAnalysis(String nationality, String occupation, String sex, int age, double income){


    }


    @Override
    public String toString() {
        return "DataAnalysis{" +
                "nationality='" + nationality + '\'' +
                ", occupation='" + occupation + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", income=" + income +
                '}';
    }
}
