package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    public void step() {
        System.out.println("Наступила нога Toshiba");
    }

    public int getPrice() {
        return price;
    }
}
