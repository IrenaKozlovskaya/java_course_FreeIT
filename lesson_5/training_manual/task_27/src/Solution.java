import abstractClases.BankCard;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Solution {
    public static void main(String[] args) {
        BankCard card1 = new ChipCard("Мир", "2200 3164 0101 3223", "чип");
        System.out.println(card1);
        card1.pay();

        BankCard card2 = new MagneticStripeCard("Visa", "2015 3623 8545 8558", "магнитная полоса");
        System.out.println(card2);
        card2.pay();

        BankCard card3 = new CardWithPayPassTechnologies("MasterCard", "5252 1214 0002 3698", "чип и антенна", "))))", "PayPass");
        System.out.println(card3);
        card3.pay();

        BankCard card4 = new CardWithPayWaveTechnologies("Visa", "4544 2525 0000 3665", "чип и антенна", "))))", "PayWave");
        System.out.println(card4);


    }
}
