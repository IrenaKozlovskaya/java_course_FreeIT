public class Solution {
    public static void main (String [] args) {
        int n = 4562;
        String s = String.valueOf(n);
        if(s.length()==4){
            for(int i = s.length()-1; i>=0; i--){
                System.out.print(s.charAt(i));
            }
        }
        else {
            System.out.print("Entered the wrong number");
        }
    }
}