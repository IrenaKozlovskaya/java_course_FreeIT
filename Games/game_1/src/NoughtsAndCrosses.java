import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NoughtsAndCrosses {
    /**
     * написать игру крестики нолики (двумерный массив размерностью 3х3).
     * Для этой задачи сделайте отдельную ветку
     * <p>
     * 1. Не используя классы и методы - все в методе main
     * 2. Не используя утильные классы (Arrays и Math)
     * 3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель
     * (три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        String[][] game = new String[3][3];
        StringBuilder z = new StringBuilder();
        StringBuilder e = new StringBuilder();
        String stepHuman = "|x|";
        String stepComputer = "|0|";
        String si;
        String sj;
        String keeper = "012";
        int verticalHuman = 0;
        int verticalComputer = 0;
        int diagonalHuman = 0;
        int diagonalComputer = 0;
        int count= 0;
        int computer;
        int human;
        int i = 0;
        int j = 0;
        while (true) {
            computer = random.nextInt(9); // кидаем кости (0 - 9). У кого больше выпадет тот ходит первым
            System.out.println("Решим кто будет ходить первым! Выберите цифру от 0 до 9");
            human = Integer.parseInt(reader.readLine());
            System.out.println("Компьютер  -  " + computer);
            if (human < 10 && human >= 0 ) {
                if (human > computer) {
                    human = 10;
                    break;
                } else if (human < computer) {
                    computer = 10;
                    break;
                }
            }
            System.out.println("У вас выпали одинаковые числа. Повторите ввод.");
        }
        winner:
        for (int m = 0; m < 3; m++) {
            for (int g = 0; g < 3; g++) {
                if (computer == 10) {
                    System.out.println("Ходит компьютер");
                    i = random.nextInt(3);
                    si = Integer.toString(i);
                    j = random.nextInt(3);
                    sj = Integer.toString(j);
                    if (z.toString().contains(si) && e.toString().contains(sj)) {
                        end_search:
                        while (true) {
                            for (int w = 0; w < z.length(); w++) {
                                if (count != z.length()) {
                                    if ((si.charAt(0) == z.charAt(w)) && (sj.charAt(0)== e.charAt(w))) {
                                        i = random.nextInt(3);
                                        si = Integer.toString(i);
                                        j = random.nextInt(3);
                                        sj = Integer.toString(j);
                                        count = 0;
                                        break;
                                    } else if ((si.charAt(0) != z.charAt(w)) || (sj.charAt(0)!= e.charAt(w))) {
                                        count++;
                                    }
                                } else {
                                    break end_search;
                                }
                            }
                        }
                    }
                    z.append(i);
                    e.append(j);
                    System.out.println("Порядок положения в массиве " + i + "-" + j);
                    human = 10;
                    computer = 0;
                } else if (human == 10) {
                    System.out.println("Твой ход. Введите строку и столбец места в которое хотите поставить Х. Используйте числа от 0 до 2 включительно.");
                    if (z.isEmpty()) {
                        for (int o = 0; o < 3; o++) {
                            for (int u = 0; u < 3; u++) {
                                game[o][u] = "|*|";
                                System.out.print(game[o][u]);
                            }
                            System.out.println();
                        }
                    }
                    si = reader.readLine();
                    sj = reader.readLine();
                    while (true) {
                        if (keeper.contains(si) && keeper.contains(sj)) {
                            if (z.toString().contains(si) && e.toString().contains(sj)) {
                                end_search:
                                while (true) {
                                    for (int w = 0; w < z.length(); w++) {
                                        if (count != z.length()) {
                                            if ((si.charAt(0) == z.charAt(w)) && (sj.charAt(0) == e.charAt(w))) {
                                                System.out.println("Вы выбрали место, которое уже занято! Введите координаты ещё раз!");
                                                while (true) {
                                                    si = reader.readLine();
                                                    sj = reader.readLine();
                                                    if (keeper.contains(si) && keeper.contains(sj)) {
                                                        break;
                                                    } else {
                                                        System.out.println("Введены неверные координаты. Строка и столбец должны равнятся от 0 до 2 включительно.");
                                                    }
                                                }
                                                count = 0;
                                                break;
                                            } else if (si.charAt(0) != z.charAt(w) || (sj.charAt(0) != e.charAt(w))) {
                                                count++;
                                            }
                                        } else {
                                            break end_search;
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            System.out.println("Введены неверные координаты. Выберите свободную ячейку и повторите ввод чисел. Они должны равнятся от 0 до 2 включительно.");
                            si = reader.readLine();
                            sj = reader.readLine();
                        }
                    }
                    i = Integer.parseInt(si);
                    j = Integer.parseInt(sj);
                    z.append(i);
                    e.append(j);
                    System.out.println("Порядок положения в массиве " + i + "-" + j);
                    computer = 10;
                    human = 0;
                }
                for (int o = 0; o < 3; o++) {
                    for (int u = 0; u < 3; u++) {
                        if (i == o && j == u) {
                            if (computer == 10) {
                                game[o][u] = stepHuman;
                            } else if (human == 10) {
                                game[o][u] = stepComputer;
                            }
                        }
                        if (game[o][0]== stepHuman && game[o][1]== stepHuman && game[o][2]== stepHuman || game[0][o]== stepHuman && game[1][o]== stepHuman && game[2][o]== stepHuman) {
                                verticalHuman++;
                            } else if (game[o][0]== stepComputer && game[o][1]== stepComputer && game[o][2]== stepComputer || game[0][o]== stepComputer && game[1][o]== stepComputer && game[2][o]== stepComputer) {
                                verticalComputer++;
                            }
                            if (game[0][2]== stepHuman && game[2][0]== stepHuman && game[1][1]== stepHuman || game[2][2]== stepHuman && game[0][0]== stepHuman && game[1][1]== stepHuman) {
                                diagonalHuman++;
                            } else if (game[0][2]== stepComputer && game[2][0]== stepComputer && game[1][1]== stepComputer || game[2][2]== stepComputer&& game[0][0]== stepComputer && game[1][1]== stepComputer) {
                                diagonalComputer++;
                            }
                         if (game[o][u]!= stepComputer && game[o][u]!= stepHuman) {
                            game[o][u] = "|*|";
                        }
                        System.out.print(game[o][u]);
                    }
                    System.out.println();
                }
                if( diagonalComputer>0||verticalComputer >0){
                    System.out.println("Вы проиграли! Победил высший разум!");
                    break winner;
                }
                else if( diagonalHuman>0 || verticalHuman >0){
                    System.out.println("Вы выиграли! Поздравляю! ");
                    break winner;
                }
                count = 0;
            }
        }
        if (diagonalComputer==0&&verticalComputer ==0 && diagonalHuman==0 && verticalHuman==0) {
            System.out.println("Ничья! Победила дружба! ");
        }
    }
}

