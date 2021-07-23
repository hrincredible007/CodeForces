package Divivsion_A;

import java.util.Scanner;

public class PolycarpAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int a = n / 3;
            int b = (n - n / 3) / 2;
            if ((a + 2 * b) != n) {
                System.out.println(a + 1 + " " + b);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}
