public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMass = 80 ;
        float height = 180;
        float imt = service.calculate( bodyMass , height);
        System.out.println(imt);
    }
}