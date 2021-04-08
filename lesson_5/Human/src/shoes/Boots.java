package shoes;

public class Boots implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Надеть ботинки и застегнуть замки.");

    }

    @Override
    public void takeOff() {
        System.out.println("Растегнуть замки и снять ботинки.");


    }
}
