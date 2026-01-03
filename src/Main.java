public class Main {
    public static void main(String[] args) {

        Servicable s1 = new Car("Toyota", 2018, 20000, 4);
        Servicable s2 = new Bus("Mercedes", 2015, 60000, 50);

        s1.performService();
        System.out.println(s1.getServiceIntervalKm());

        s2.performService();
        System.out.println(s2.getServiceIntervalKm());
    }
}
