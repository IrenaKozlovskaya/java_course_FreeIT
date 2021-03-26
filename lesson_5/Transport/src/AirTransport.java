public abstract class AirTransport extends Transport {
    private double wingspan;
    private int minRunwayLength;

    public AirTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }
}

