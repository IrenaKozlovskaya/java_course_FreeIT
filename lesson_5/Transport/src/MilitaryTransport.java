public class MilitaryTransport extends AirTransport {
    private boolean catapult;
    private int numberOfRockets;

    public MilitaryTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minRunwayLength, boolean catapult, int numberOfRockets) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.catapult = catapult;
        this.numberOfRockets = numberOfRockets;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public String toString() {
        return super.toString() + ", наличие системы катапультирования - " + isCatapult() + ", количество ракет на борту - " + getNumberOfRockets();
    }

    public void launch_rocket(int numberOfRockets) {
        while (numberOfRockets >= 0) {
            if (numberOfRockets == 0) {
                System.out.println("Боеприпасы отсутствуют");
            } else
                System.out.println("Ракета пошла…");
            numberOfRockets--;
        }
    }

    public void launch_catapult() {
        if (isCatapult()) {
            System.out.println("Катапультирование прошло успешно");
        } else
            System.out.println("У вас нет такой системы");
    }
}
