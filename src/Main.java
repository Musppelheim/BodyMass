public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weight = 100;
        double height = 1.82;
        double Bmi = BmiService.calculate (weight, height);
        System.out.println(Bmi);
    }
}
