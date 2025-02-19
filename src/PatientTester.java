
import java.util.ArrayList;

public class PatientTester {
    public static void main(String[] args) {
        PatientManager manager = new PatientManager();

        System.out.print(manager.toString());

        manager.addPatient(new Patient(1, 200));
        manager.addPatient(new Patient(2, 400));
        manager.addPatient(new Patient(3, 600));
        manager.addPatient(new Patient(4, 800));

        System.out.print(manager.toString());

        manager.caffeineAbsorption();
        manager.caffeineAbsorption();

        System.out.print(manager.toString());

        int patientToRemove = -1;
        double highestCaffeine = 0;
        ArrayList<Patient> patients = manager.getPatients();
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) != null && patients.get(i).getCaffeine() > highestCaffeine) {
                patientToRemove = i;
                highestCaffeine = patients.get(i).getCaffeine();
            }
        }
        manager.removePatient(patientToRemove);

        System.out.print(manager.toString());
    }
}
