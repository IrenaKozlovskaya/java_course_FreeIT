public class TimeInterval {
    /**
     * Создать класс и объекты описывающие промежуток времени. Сам промежуток
     * в классе должен задаваться тремя свойствами: секундами, минутами, часами.
     * Сделать методы для получения полного количества секунд в объекте, сравнения
     * двух объектов (метод должен работать аналогично compareTo в строках). Создать
     * два конструктора: получающий общее количество секунд, и часы, минуты и секунды
     * по отдельности. Сделать метод для вывода данных.
     */
    private int sec;
    private int min;
    private int hours;
    private int total_sec;

    public TimeInterval(int sec) {
        this.total_sec = sec;
    }

    public TimeInterval(int hours, int min, int sec) {
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public static void main(String[] args) {
        TimeInterval first_interval = new TimeInterval(3, 3, 28);
        TimeInterval second_interval = new TimeInterval(7, 3, 28);
        first_interval.print(new TimeInterval(first_interval.totalNumberOfSeconds()), new TimeInterval(second_interval.totalNumberOfSeconds()));
    }

    public int totalNumberOfSeconds() {
        return total_sec = sec + (min + (hours * 60)) * 60;
    }

    public int compare(TimeInterval first_interval, TimeInterval second_interval) {
        return Integer.compare(first_interval.total_sec, second_interval.total_sec);

    }

    public void print(TimeInterval first_interval, TimeInterval second_interval) {
        System.out.println("Первый промежуток времени " + first_interval.total_sec);
        System.out.println("Второй промежуток времени " + second_interval.total_sec);
        System.out.println("Вывод " + compare(first_interval, second_interval));

    }


}
