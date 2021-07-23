package Division_B;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int k = 0;
        String wd = "";
        for (int i = 1; i < n; i++) {
            char ch  = str.charAt(i-1);
            char ch1 = str.charAt(i);

            if(ch == '-' && ch1 == '.'){
                if(i>n-2) {
                    System.out.print(1);

                }
                else {
                    System.out.print(1);
                    i++;
                }
                wd+="-.";
            }
            else if(ch== '-' && ch1== '-'){
                if(i>n-2) {
                    System.out.print(2);
                }
                else {
                    System.out.print(2);
                    i++;
                }
                wd+="--";

            }
            else if(ch=='.' || ch1=='.') {
                System.out.print(0);
                wd+='.';
            }

        }
        //System.out.println(wd);
        if(wd.length()< str.length()){
            System.out.print(0);
        }
    }
}