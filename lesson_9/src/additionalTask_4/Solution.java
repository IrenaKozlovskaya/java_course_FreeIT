package additionalTask_4;


import java.io.*;

public class Solution {
    public static void main(String[] args) {

        Car car = new Car("Ford", 220, 20000);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("saver.txt"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("saver.txt"))) {

            objectOutputStream.writeObject(car);
            objectOutputStream.close();
            objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Класс Employee не найден");
        }

        System.out.println(car.toString());


    }


}
