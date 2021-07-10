package Divivsion_A;

import java.util.Scanner;
public class ExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == b) {// Case of Infinite Excitement....
                System.out.println(0 + " " + 0);
                continue;
            }
            long gcd = Math.abs(a - b);
            long noOfSteps = Math.min(a % gcd, gcd - (a% gcd));
            System.out.println(gcd + " " + noOfSteps);
        }

    }
}
