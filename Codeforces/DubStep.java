package A2OJ.Division_A;

import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String wd = "WUB";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            res = res + ch;
            if (res.contains(wd)) {
                res = res.substring(0, res.length() - 3);
                res += " ";
            }
        }
        System.out.println(res.trim());
    }
}
