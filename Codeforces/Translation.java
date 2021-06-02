package A2OJ.Divivsion_A;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ss.insert(0, ch);
        }
        if(ss.toString().equalsIgnoreCase(t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
