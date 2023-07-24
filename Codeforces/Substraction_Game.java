package A;

import java.util.Scanner;

public class Substraction_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
             System.out.println(Math.min(a, b)*2);

        }
    }
}
