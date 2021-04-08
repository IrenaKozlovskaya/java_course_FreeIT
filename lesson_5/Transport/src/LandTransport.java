public abstract class LandTransport extends Transport {
    private int wheel;
    private double fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String model, int wheel, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.wheel = wheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество колес - " + getWheel() + ", расход топлива - " + getFuelConsumption() + " л/100км";
    }
}
