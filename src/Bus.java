public class Bus extends Vehicle implements Servicable {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08 + getAge() * 150;
    }

    @Override
    public void performService() {
        System.out.println("Bus service performed");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }
}

