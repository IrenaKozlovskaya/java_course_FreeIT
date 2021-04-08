public class PassengerTransport extends LandTransport {
    private String carBodyType;
    private int maxNumberOfPassenger;

    public PassengerTransport(int power, int maxSpeed, int weight, String model, int numberOfWheels, double fuelConsumption, String carBodyType, int maxNumberOfPassenger) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.carBodyType = carBodyType;
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public void setMaxNumberOfPassenger(int maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип кузова - " + getCarBodyType() + ", количество пассажиров - " + getMaxNumberOfPassenger();
    }

    public void calculateOfDistanceTraveledWithMaxSpeed(double time) {
        int distanceTraveled = (int) (time * getMaxSpeed());
        double consumedFuel = calculateOfConsumedFuel(distanceTraveled);
        System.out.println("За время " + time + " часа, автомобиль " + getModel() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " + distanceTraveled + " км и израсходует " + consumedFuel + " литров топлива");
    }

    private double calculateOfConsumedFuel(int distanceTraveled) {
        return getFuelConsumption() * distanceTraveled / 100;
    }
}
