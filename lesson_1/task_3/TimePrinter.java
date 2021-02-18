public class TimePrinter {
    public static void main (String [] arg){
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int week = (d - day) / 7;
        System.out.println("A)"+ m + " min, " + sec + " sec");
        System.out.println("B)"+ h + " hours, " + min + " min, " + sec + " sec");
        System.out.println("C)"+ d + " days, " + hour + " hours, " + min + " min, " + sec + " sec");
        System.out.println("D)"+ week + " weeks, " + day + " days, " + hour + " hours, " + min + " min, " + sec + " sec");
    }
}