package shoes;

public class Sneakers implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Натянуть кроссовки и завязать шнурки.");

    }

    @Override
    public void takeOff() {
        System.out.println("Развязать шнурки и снять кроссовки.");

    }
}
