//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Servicable s1 = new Car("Toyota", 2020, 20000, 4);
        Servicable s2 = new Bus("Mercedes", 2018, 60000, 50);

        s1.performService();
        System.out.println("Service interval: " + s1.getServiceIntervalKm() + " km");

        System.out.println();

        s2.performService();
        System.out.println("Service interval: " + s2.getServiceIntervalKm() + " km");
    }
}
