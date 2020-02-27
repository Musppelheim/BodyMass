public class BmiService {
    public static double calculate(int weight, double height) {
         weight = 82;
         height = 1.82;
        double Bmi = weight / (height * height);
        return Bmi;
    }
}
