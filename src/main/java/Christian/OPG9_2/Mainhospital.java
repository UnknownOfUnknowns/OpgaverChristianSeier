package Christian.OPG9_2;

public class Mainhospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Hans");

        doctor.service();

        Administrator admin = new Administrator("Christian");

        admin.Admin();

        Nurse nurse = new Nurse("Seier");

        nurse.nurses();
    }
}
