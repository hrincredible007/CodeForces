package Division_B;

import java.util.Arrays;
import java.util.Scanner;

public class LettersRearranging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String wd = sc.next();
            char[] c = wd.toCharArray();
            Arrays.sort(c);
            boolean result = Palindrome(wd);
            if(result && c[0] != c[c.length-1])
                System.out.println(c);
            else if(c[0] == c[c.length-1]){
                System.out.println(-1);
            }
            else{
                System.out.println(wd);
            }
        }
    }

    private static boolean Palindrome(String wd) {
        String res = "";
        for (int i = 0; i < wd.length(); i++) {
            res = wd.charAt(i)+res;
        }
        if(res.equals(wd)){
            return true;
        }
        return false;
    }
}
