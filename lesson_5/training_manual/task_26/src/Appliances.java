public abstract class Appliances implements PlugIn {
    protected String name;

    public void plugIn() {
        System.out.println(name + " включен в розетку");
    }
}

abstract class KitchenAppliances extends Appliances {

}

class Fridge extends KitchenAppliances {
    public Fridge() {
        name = "Холодильник";
    }

}

class ElectricKettle extends KitchenAppliances {
    public ElectricKettle() {
        name = "Электрочайник";
    }
}

class Blender extends KitchenAppliances {
    protected int power;

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
}
