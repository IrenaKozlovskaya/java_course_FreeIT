
/**
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько
 * объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Solution {
    public static void main(String[] args) {
        Appliances kettle = new ElectricKettle();
        Appliances fridge = new Fridge();
        fridge.plugIn();
        Appliances blender = new Blender("Блендер", 2200);
        blender.plugIn();
        Appliances hand_blender = new HandBlender("Погружной блендер", 1800);
        hand_blender.plugIn();
    }
}
