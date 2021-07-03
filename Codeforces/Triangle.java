package Divivsion_A;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if ((a + b > c && a + c > b && b + c > a) || (a + b > d && a + d > b && b + d > a) || (a + c > d && a + d > c && c + d > a) || (b + c > d && b + d > c && c + d > b)) {
            System.out.println("TRIANGLE");
        } else if ((a + b == c || a + c == b || b + c == a) || (a + b == d || a + d == b || b + d == a) || (a + c == d || a + d == c || c + d == a) || (b + c == d || b + d == c || c + d == b)) {
            System.out.println("SEGMENT");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}