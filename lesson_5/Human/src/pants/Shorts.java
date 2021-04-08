package pants;

public class Shorts implements Pants {
    @Override
    public void putOn() {
        System.out.println("Надеть шорты, завязать шнурок.");

    }

    @Override
    public void takeOff() {
        System.out.println("Развязать шнурок, снять шорты.");


    }
}
