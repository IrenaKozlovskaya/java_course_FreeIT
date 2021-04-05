public class PositiveOrNegative {
    /**
     * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или
     * отрицательное. Например, "это однозначное положительное число". Достаточно будет определить, является ли число
     * однозначным, "двухзначным или трехзначным и более.
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1999) - 999;
        switch (numberOfDigits(number)) {
            case (1) -> System.out.print(number + " This is a one-digit ");
            case (2) -> System.out.print(number + " This is a two-digit ");
            case (3) -> System.out.print(number + " This is a three-digit ");
        }
        if (number > 0) {
            System.out.print("positive number ");
        } else if (number < 0) {
            System.out.print("negative number ");
        }

    }

    public static int numberOfDigits(int number) {
        int digit = 0;
        while (number != 0) {
            number = number / 10;
            digit++;
        }
        return digit;
    }
}
