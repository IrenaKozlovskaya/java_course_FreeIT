public class FreightTransport extends LandTransport {
    private int liftingCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String model, int wheel, double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, model, wheel, fuelConsumption);
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

    public void truck_capacity(int cargo) {
        if (liftingCapacity >= cargo) {
            System.out.println("Грузовик загружен");
        } else
            System.out.println("Вам нужен грузовик побольше");

    }
}
