import jacket.Jacket;
import pants.Pants;
import shoes.Shoes;

public class Human {

    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void putOn() {
        this.pants.putOn();
        this.jacket.putOn();
        this.shoes.putOn();


    }

    public void takeOff() {
        this.jacket.takeOff();
        this.shoes.takeOff();
        this.pants.takeOff();

    }
}
