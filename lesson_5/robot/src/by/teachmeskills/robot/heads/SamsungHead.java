package by.teachmeskills.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {

    }

    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    public int getPrice() {
        return price;
    }
}
