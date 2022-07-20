package Christian.OPG9_5;

import java.util.ArrayList;

public class DataAnalyse {
    public ArrayList<Person> data;

    public DataAnalyse(ArrayList<Person> data){
        this.data = data;
    }

    public void gennemsnitIncome(){
        int indkomst = 0;
        double gennemsnit;
        int antal = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getClass() == Africa.class) {
                indkomst += data.get(i).income;
                antal++;
            }
        }
        gennemsnit = (double)indkomst / antal;
        System.out.println(gennemsnit);
    }


}
