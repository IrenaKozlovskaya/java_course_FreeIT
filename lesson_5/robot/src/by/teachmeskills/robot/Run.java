package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SamsungHead(3), new ToshibaHand(10), new SamsungLeg(6));
        Robot robot2 = new Robot(new SonyHead(10), new SamsungHand(7), new SonyLeg(11));
        Robot robot3 = new Robot(new ToshibaHead(10), new SonyHand(7), new ToshibaLeg(11));
        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        int maxPrice = Math.max(robot1.getPrice(), Math.max(robot2.getPrice(), robot3.getPrice()));
        if (robot1.getPrice() == maxPrice) {
            System.out.println("Робот №1 имеет максимальную цену : " + maxPrice + " у.е");
        }
        if (robot2.getPrice() == maxPrice) {
            System.out.println("Робот №2 имеет максимальную цену : " + maxPrice + " у.е");
        }
        if (robot3.getPrice() == maxPrice) {
            System.out.println("Робот №3 имеет максимальную цену : " + maxPrice + " у.е");
        }


    }
}
