public class SpaceX implements IStart {
    @Override
    public boolean check() {
        System.out.println("Начинается предстартовая проверка SpaceX.");
        int check = (int) (Math.random() * 10);
        if (check > 4) {
            System.out.println("Проверка пройдена!");
            return true;
        }


        return false;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX.");

    }
}
