public class MilitaryTransport extends AirTransport {
    private boolean catapult;
    private int rocket;

    public MilitaryTransport(int power, int maxSpeed, int weight, String model, double wingspan, int minRunwayLength, boolean catapult, int rocket) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.catapult = catapult;
        this.rocket = rocket;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getRocket() {
        return rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    @Override
    public String toString() {
        return super.toString() + ", наличие системы катапультирования - " + isCatapult() + ", количество ракет на борту - " + getRocket();
    }

    public void rocket_launch(int rocket) {
        while (rocket >= 0) {
            if (rocket == 0) {
                System.out.println("Боеприпасы отсутствуют");
            } else
                System.out.println("Ракета пошла…");
            rocket--;
        }
    }

    public void catapult_launch() {
        if (isCatapult()) {
            System.out.println("Катапультирование прошло успешно");
        } else
            System.out.println("У вас нет такой системы");
    }
}
