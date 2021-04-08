package by.teachmeskills.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {

    }

    public void upHand() {
        System.out.println("Поднялась рука Samsung");
    }

    public int getPrice() {
        return price;
    }
}
