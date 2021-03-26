package pants;

public class Jeans implements Pants {
    @Override
    public void putOn() {
        System.out.println("Напялить джинсы, застегнуть молнию и пуговицу.");


    }

    @Override
    public void takeOff() {
        System.out.println("Растегнуть пуговицу, затем молнию, снять джинсы.");


    }
}
