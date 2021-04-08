package jacket;

public class Coat implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надеть пальто, застегнуть пуговицы и завязать пояс.");
    }

    @Override
    public void takeOff() {
        System.out.println("Развязать пояс и пуговицы, снять пальто.");


    }
}
