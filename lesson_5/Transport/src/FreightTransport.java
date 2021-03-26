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

    public String description() {
        String result = getModel() + ": мощность - " + getPower() + " л/с (" + powerInKB() + " кВт), максимальная скорость - " + getMaxSpeed() + " км/ч, масса - " + getWeight() + " кг, количество колес - " + getWheel() + ", расход топлива - " + getFuelConsumption() + " л/100км, грузоподъемность - " + getLiftingCapacity() + " т";
        return result;


    }

    public int powerInKB() {
        return (int) (getPower() * 0.74);
    }

    public void capacity(int cargo) {
        if (liftingCapacity >= cargo) {
            System.out.println("Грузовик загружен");
        } else
            System.out.println("Вам нужен грузовик побольше");

    }
}
