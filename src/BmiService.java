public class BmiService {
    public int canculate(double weightInKg, double heightInM) {
        double bmi = weightInKg / Math.pow(heightInM, 2);
        return (int) bmi;
    }
}
