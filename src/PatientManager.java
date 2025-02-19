import java.util.ArrayList;

public class PatientManager {
    private static final double CAFFEINE_AMOUNT = 160.0; // doing a constant the way I've learned in previous experience, would normally go in separate Constants.java file
    private ArrayList<Patient> _patients;

    public PatientManager() {
        _patients = new ArrayList<>(); // default is 10 items
        for (int i = 0; i < 10; i++) {
            _patients.add(null);
        }
    }

    public ArrayList<Patient> getPatients() {
        return _patients;
    }

    public int addPatient(Patient patient) {
        for (int i = 0; i < _patients.size(); i++) {
            if (_patients.get(i) == null) {
               _patients.set(i, patient);
               return i;
            }
        }
        return -1;
    }

    public Patient removePatient(int index) {
        return _patients.set(index, null); // returns patient that was overwritten
    }

    public void caffeineAbsorption() {
        for (int i = 0; i < _patients.size(); i++) {
            Patient patient = _patients.get(i);
            if (patient != null) {
                patient.absorbCaffeine(CAFFEINE_AMOUNT);
                if (patient.getCaffeine() <= 0) {
                    removePatient(i);
                }
            }
        }
    }

    @Override
    public String toString() {
        boolean isEmpty = true;
        for (int i = 0; i < _patients.size(); i++) {
            if (_patients.get(i) != null) {
               isEmpty = false;
            }
        }
        if (isEmpty) {
            return "Empty\n";
        }
        String outStr = "";
        for (int i = 0; i < _patients.size(); i++) {
            Patient patient = _patients.get(i);
            if (patient != null) {
               outStr += "" + patient.getID() + " " + patient.getCaffeine() + "\n";
            }
        }
        return outStr;
    }
}
