public class PositiveOrNegative {
    /**
     * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или
     * отрицательное. Например, "это однозначное положительное число". Достаточно будет определить, является ли число
     * однозначным, "двухзначным или трехзначным и более.
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1999) - 999;
        if (number == 0) {
            System.out.println("This number is 0");
        } else if (number % 10 == number && number > 0) {
            System.out.println(number + " This is a one-digit positive number");
        } else if (number % 10 == number && number < 0) {
            System.out.println(number + " This is a one-digit negative number");
        } else if (number % 100 == number && number > 0) {
            System.out.println(number + " This is a two-digit positive number");
        } else if (number % 100 == number && number < 0) {
            System.out.println(number + " This is a two-digit negative number");
        } else if (number % 1000 == number && number > 0) {
            System.out.println(number + " This is a three-digit positive number");
        } else if (number % 1000 == number && number < 0) {
            System.out.println(number + " This is a three-digit negative number");
        }


    }
}
