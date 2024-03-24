public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.canculate(98, 1.87);
        System.out.println(index);
    }
}