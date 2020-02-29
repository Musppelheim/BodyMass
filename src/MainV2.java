public class MainV2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.82;
        int weight = 82;
        double Bmi = service.calculate(height, weight);
        System.out.println(Bmi);
    }
}

