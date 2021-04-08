public abstract class LandTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String model, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество колес - " + getNumberOfWheels() + ", расход топлива - " + getFuelConsumption() + " л/100км";
    }
}
