package Contests.CodeForcesRound726;

import java.util.Scanner;

public class ArithmeticArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                s+=arr[i];
            }
            //System.out.println(s);
            double arithmeticMean = (double) s/n;
            if(arithmeticMean == 1){
                System.out.println(0);
                continue;
            }
            if(s<=n){
                System.out.println(1);
            }
            else if(s>n){
                System.out.println(s-n);
            }


        }
    }
}