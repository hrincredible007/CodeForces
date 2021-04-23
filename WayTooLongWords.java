package A2OJ.Division_A;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while(n-- >0){
            String str = sc.next();
            if(str.length()>10)

                System.out.println(str.charAt(0)+""+(str.length()-2)+str.charAt(str.length()-1));
            else
                System.out.println(str);
        }
    }
}
