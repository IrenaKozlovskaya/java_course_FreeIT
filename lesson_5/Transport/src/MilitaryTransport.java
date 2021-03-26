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

    public String description() {
        String result = getModel() + ": мощность - " + getPower() + " л/с (" + powerInKB() + " кВт), максимальная скорость - " + getMaxSpeed() + " км/ч, масса - " + getWeight() + " кг, размах крыльев - " + getWingspan() + " м, минимальная длина взлётно-посадочной полосы для взлёта - " + getMinRunwayLength() + " м, наличие системы катапультирования - " + isCatapult() + ", количество ракет на борту - " + getRocket();
        return result;
    }

    public int powerInKB() {
        return (int) (getPower() * 0.74);
    }

    public void shot(int rocket) {
        while (rocket >= 0) {
            if (rocket == 0) {
                System.out.println("Боеприпасы отсутствуют");
            } else
                System.out.println("Ракета пошла…");
            rocket--;
        }
    }

    public void bailout() {
        if (isCatapult()) {
            System.out.println("Катапультирование прошло успешно");
        } else
            System.out.println("У вас нет такой системы");
    }
}
