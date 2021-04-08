public class PassengerTransport extends LandTransport {
    private String carBodyType;
    private int passenger;

    public PassengerTransport(int power, int maxSpeed, int weight, String model, int wheel, double fuelConsumption, String carBodyType, int passenger) {
        super(power, maxSpeed, weight, model, wheel, fuelConsumption);
        this.carBodyType = carBodyType;
        this.passenger = passenger;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип кузова - " + getCarBodyType() + ", количество пассажиров - " + getPassenger();
    }

    public void distanceTraveled_withMaxSpeed(double time) {
        int way = (int) (time * getMaxSpeed());
        double fuel = fuel_consumed(way);
        System.out.println("За время " + time + " часа, автомобиль " + getModel() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " + way + " км и израсходует " + fuel + " литров топлива");
    }

    private double fuel_consumed(int way) {
        return getFuelConsumption() * way / 100;
    }
}
