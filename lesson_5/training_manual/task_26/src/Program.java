/**
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько
 * объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Program {
    public static void main(String[] args) {
        Appliances microwave = new Microwave();
        Appliances fridge = new Fridge();
        fridge.plugIn();
        Appliances blender = new Blender("Блендер", 2200);
        blender.plugIn();
        Appliances hand_blender = new HandBlender("Погружной блендер", 1800);
        hand_blender.plugIn();
    }
}

abstract class Appliances {
    abstract public void plugIn();
}

class KitchenAppliances extends Appliances {

    @Override
    public void plugIn() {
        System.out.println("Какая-то бытовая техника включена в розетку");
    }
}

class Fridge extends KitchenAppliances {
    @Override
    public void plugIn() {
        System.out.println("Холодильник включен в розетку");
    }
}

class Microwave extends KitchenAppliances {
    @Override
    public void plugIn() {
        System.out.println("Микровалновка включена в розетку");
    }
}

class Blender extends KitchenAppliances {
    String name;
    int power;

    public Blender(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void plugIn() {
        System.out.println(this.name + " мощностью " + this.power + " включен в розетку");
    }
}

class HandBlender extends Blender {

    public HandBlender(String name, int power) {
        super(name, power);
    }

    @Override
    public void plugIn() {
        System.out.println(this.name + " мощностью " + this.power + " включен в розетку");
    }
}
