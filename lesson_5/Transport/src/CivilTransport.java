public class CivilTransport extends AirTransport {
    private int passenger;
    private boolean businessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minRunwayLength, int passenger, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.passenger = passenger;
        this.businessClass = businessClass;

    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public String description() {
        String result = getModel() + ": мощность - " + getPower() + " л/с (" + powerInKB() + " кВт), максимальная скорость - " + getMaxSpeed() + " км/ч, масса - " + getWeight() + " кг, размах крыльев - " + getWingspan() + " м, минимальная длина взлётно-посадочной полосы для взлёта - " + getMinRunwayLength() + " м, количество пассажиров - " + getPassenger() + ", наличие бизнес класса - " + isBusinessClass();
        return result;
    }

    public int powerInKB() {
        return (int) (getPower() * 0.74);
    }

    public void capacity(int passenger) {
        if (getPassenger() >= passenger) {
            System.out.println(passenger + " пассажиров поместилось в самолёт");
        } else
            System.out.println("Вам нужен самолёт побольше");
    }
}
