public class Shuttle implements IStart {


    @Override
    public boolean check() {
        System.out.println("Начинается предстартовая проверка Шаттла.");
        int check = (int) (Math.random() * 10);
        if (check > 3) {
            System.out.println("Проверка пройдена!");
            return true;
        }
        return false;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла.");

    }
}
