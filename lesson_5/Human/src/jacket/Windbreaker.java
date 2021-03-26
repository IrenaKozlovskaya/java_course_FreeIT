package jacket;

public class Windbreaker implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надеть ветровку, застегнуть молнию.");

    }

    @Override
    public void takeOff() {
        System.out.println("Растегнуть молнию и снять ветровку.");


    }
}
