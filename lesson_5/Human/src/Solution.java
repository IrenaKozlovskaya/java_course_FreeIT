import jacket.Coat;
import jacket.Windbreaker;
import pants.Jeans;
import pants.Shorts;
import shoes.Boots;
import shoes.Sneakers;

public class Solution {
    /**
     * Интерфейсы:
     * - Куртка
     * - Штаны
     * - Обувь
     * в каждом интерфейсе есть 2 метода (надеть и снять)
     * Делаем несколько реализации каждого интерфейса.
     * Создаём класс человек:
     * У человека поля:
     * -имя
     * -куртка
     * -штаны
     * -обувь
     * У человека есть 2 метода:
     * - одеться(вызываются методы надеть у всех вещей)
     * - раздеться (вызываются методы снять у всех вещей)
     **/
    public static void main(String[] args) {

        Human human1 = new Human("Irena", new Windbreaker(), new Shorts(), new Sneakers());
        human1.putOn();
        System.out.println("");
        human1.takeOff();
        System.out.println("");
        Human human2 = new Human("Marina", new Coat(), new Jeans(), new Boots());
        human2.putOn();
        System.out.println("");
        human2.takeOff();

    }
}
