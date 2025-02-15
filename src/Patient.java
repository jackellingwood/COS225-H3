public class Patient {
    private int _id;
    private double _caffeine;

    public Patient(int id, double caffeine) {
        _id = id;
        _caffeine = caffeine;
    }

    public int getID() {
        return _id;
    }

    public double getCaffeine() {
        return _caffeine;
    }

    public void absorbCaffeine(double amount) {
        _caffeine -= amount;
    }
}
