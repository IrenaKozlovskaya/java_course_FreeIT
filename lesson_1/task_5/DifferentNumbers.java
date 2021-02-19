public class DifferentNumbers {
    public static void main(String[] args) {
        int n = 2516;
        String s = String.valueOf(n);
        int count = 0;
        if (s.length() == 4) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j) && j != i) {
                        count++;
                    }
                }
            }
            if (count > 0) {
                System.out.print("False");
            } else if (count == 0) {
                System.out.print("True");
            }
        }
        else {
            System.out.print("Entered the wrong number");
        }
    }
}