public class FreightTransport extends LandTransport {
    private int liftingCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String model, int numberOfWheels, double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", грузоподъемность - " + getLiftingCapacity() + " т";
    }

    public void checkTruckCapacity(int cargoWeight) {
        if (liftingCapacity >= cargoWeight) {
            System.out.println("Грузовик загружен");
        } else
            System.out.println("Вам нужен грузовик побольше");

    }
}
