import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Создать класс компьютер.
 * Поля:
 * - процессор
 * - оперативка
 * - жесткий диск
 * - ресурс полных циклов работы (включений/выключений)
 * Методы:
 * - метод описание(вывод всех полей)
 * - метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает. Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
 * - выключить (аналогично включению)
 * - при превышении лимита ресурса комп сгорает
 */

public class Computer {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    private String processor;
    private String ram;
    private String hdd;
    private int cycleLife;
    private boolean burned = true;

    public Computer(String processor, String ram, String hdd, int cycleLife) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.cycleLife = cycleLife;
    }

    public static void main(String[] args) throws IOException {
        Computer computer = new Computer("Core i5", "DDR4", "SDD", 1);
        int counter = 0;
        while (true) {
            if (counter == computer.cycleLife && computer.burned != false) {
                System.out.println("Ваш компьютер сгорел из-за превышения лимита ресурса");
                computer.description();
                break;
            }
            computer.on();
            computer.off();

            counter++;
        }
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public int getCycleLife() {
        return cycleLife;
    }

    public void setCycleLife(int cycleLife) {
        this.cycleLife = cycleLife;
    }

    public boolean isBurned() {
        return burned;
    }

    public void setBurned(boolean burned) {
        this.burned = burned;
    }

    public void on() throws IOException {
        System.out.println("Включение компьютера. Введите число 0 или 1");
        int your_choice = Integer.parseInt(reader.readLine());
        if (!burned) {
            System.out.println("Вашему компьютеру капут");
        } else {
            int computer_choice = random.nextInt(2);
            if (computer_choice == your_choice) {
                System.out.println("Компьютер включен");
            } else {
                System.out.println("Компьютер сгорел при попытке включения");
                description();
                burned = false;
            }
        }
    }

    public void off() throws IOException {
        System.out.println("Выключение компьютера. Введите число 0 или 1");
        int your_choice = Integer.parseInt(reader.readLine());
        if (!burned) {
            System.out.println("Вашему компьютеру капут");
        } else {
            int computer_choice = random.nextInt(2);
            if (computer_choice == your_choice) {
                System.out.println("Компьютер выключен");
            } else {
                System.out.println("Компьютер сгорел при попытке выключения");
                description();
                burned = false;
            }
        }
    }

    public void description() {
        System.out.println("Процессор " + processor + "\n" +
                "Оперативная система " + ram + "\n" +
                "Жесткий диск " + hdd + "\n" +
                "Ресурс полных циклов работы - " + cycleLife);
    }
}
