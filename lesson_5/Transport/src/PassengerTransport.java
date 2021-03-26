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

    public String description() {
        String result = getModel() + ": мощность - " + getPower() + " л/с (" + powerInKB() + " кВт), максимальная скорость - " + getMaxSpeed() + " км/ч, масса - " + getWeight() + " кг, количество колес - " + getWheel() + ", расход топлива - " + getFuelConsumption() + " л/100км, тип кузова - " + getCarBodyType() + ", количество пассажиров - " + getPassenger();
        return result;
    }

    public int powerInKB() {
        return (int) (getPower() * 0.74);
    }

    public void way(double time) {
        int way = (int) (time * getMaxSpeed());
        double fuel = fuel(way);
        System.out.println("За время " + time + " часа, автомобиль " + getModel() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " + way + " км и израсходует " + fuel + " литров топлива");
    }

    private double fuel(int way) {
        return getFuelConsumption() * way / 100;
    }
}
