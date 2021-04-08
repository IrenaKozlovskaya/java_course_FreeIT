public class CivilTransport extends AirTransport {
    private int maxNumberOfPassenger;
    private boolean businessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minRunwayLength, int maxNumberOfPassenger, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.maxNumberOfPassenger = maxNumberOfPassenger;
        this.businessClass = businessClass;

    }

    public int getMaxNumberOfPassenger() {
        return maxNumberOfPassenger;
    }

    public void setMaxNumberOfPassenger(int maxNumberOfPassenger) {
        this.maxNumberOfPassenger = maxNumberOfPassenger;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество пассажиров - " + getMaxNumberOfPassenger() + ", наличие бизнес класса - " + isBusinessClass();
    }

    public void checkAircraftPassengerCapacity(int numberOfPassengers) {
        if (getMaxNumberOfPassenger() >= numberOfPassengers) {
            System.out.println(numberOfPassengers + " пассажиров поместилось в самолёт");
        } else
            System.out.println("Вам нужен самолёт побольше");
    }
}
