package A;

import java.util.Scanner;

public class Morning_Sanwdich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int h = sc.nextInt();
            int res = c + h;
            if(res >= b){
                System.out.println(2*b-1);
            }
            else{
                System.out.println((2*res)+1);
            }
        }
    }
}
