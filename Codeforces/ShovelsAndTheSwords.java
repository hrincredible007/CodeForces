package Divivsion_A;

import java.util.Scanner;

public class ShovelsAndTheSwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
             a = sc.nextInt();
             b = sc.nextInt();
            System.out.println(Math.min(Math.min(a,b),(a+b)/3));


        }
    }
}
