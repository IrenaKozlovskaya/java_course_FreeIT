import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    /**
     * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
     * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
     * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
     * снимающую деньги. На вход передается сумма денег. На выход – булевское
     * значение (операция удалась или нет). При снятии денег функция должна
     * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
     * конструктор с тремя параметрами – количеством купюр.
     */
    private int banknote20;
    private int banknote50;
    private int banknote100;


    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ATM atm = new ATM(5, 5, 5);
        while (true) {
            System.out.println("""
                    Введите № операции.
                    1 - Пополнение счета
                    2 - Снятие наличных
                    0 - Завершить работу""");
            int numberOfOperation = Integer.parseInt(reader.readLine());
            if (numberOfOperation == 1) {
                atm.add_cash();
            } else if (numberOfOperation == 2) {
                atm.cash_withdrawal();
            } else {
                break;
            }
        }
    }

    public void add_cash() throws IOException {
        finished:
        while (true) {
            System.out.println("Вставьте купюру в банкомат. Банкомат принимает только купюры номиналом 20, 50, 100 " + "\n" +
                    "Нажмите 0 для завершения операции и вывода текущего баланса");
            int human_cash = Integer.parseInt(reader.readLine());
            switch (human_cash) {
                case (0):
                    break finished;
                case (20):
                    banknote20++;
                    break;
                case (50):
                    banknote50++;
                    break;
                case (100):
                    banknote100++;
                    break;
                default:
                    System.out.println("Вы попытались вставить неверный номинал купюры");
            }
        }
        balance();


    }

    public boolean cash_withdrawal() throws IOException {
        int hundr = 0;
        int fifty = 0;
        System.out.println("Введите сумму");
        int human_cash = Integer.parseInt(reader.readLine());

        if (human_cash % 10 == 0) {
            if (human_cash <= (banknote20 * 20 + banknote50 * 50 + banknote100 * 100)) {

                for (hundr = banknote100; hundr >= 0; hundr--) {

                    for (fifty = banknote50; fifty >= 0; fifty--) {

                        int temp = human_cash - hundr * 100 - fifty * 50;

                        if (temp % 20 == 0 && temp / 20 <= banknote20 && temp >= 0) {
                            banknote100 -= hundr;
                            banknote50 -= fifty;
                            banknote20 -= temp / 20;
                            System.out.println("Количество купюр номиналом 100: " + hundr);
                            System.out.println("Количество купюр номиналом 50: " + fifty);
                            System.out.println("Количество купюр номиналом 20: " + temp / 20);
                            balance();
                            return true;
                        }
                    }
                }
                System.out.println("Банкомат не может вывести такую сумму");
                return false;


            } else {
                System.out.println("В банкомате недостаточно средств");
                return false;

            }

        } else {
            System.out.println("В банкомате есть купюры со следующем номиналом: 100, 50, 20");
            return false;

        }
    }

    public void balance() {
        System.out.println("Текущий баланс: " + (banknote20 * 20 + banknote50 * 50 + banknote100 * 100));
    }


}
