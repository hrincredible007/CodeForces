package Contests.CodeForcesRound725;

import java.util.Scanner;

public class StoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int maximum = findMaximum(a, n);
            int minimum = findMinimum(a, n);

            int posMaximum = Search(a, n, maximum);
            int posMinimum = Search(a, n, minimum);

            //System.out.println(posMaximum+" "+posMinimum);
            // We have to find the minimum of  the following 4 conditions
            int condition1 = Math.max(posMaximum+1, posMinimum+1);
            int condition2 = Math.max(n-posMaximum,n-posMinimum);
            int condition3 = posMinimum+1+n- posMaximum;
            int condition4 = posMaximum+1+n-posMinimum;
            int res = Math.min(condition1, condition2);
            res = Math.min(res, condition3);
            res = Math.min(res, condition4);
            System.out.println(res);

        }
    }

    private static int Search(int[] a, int n, int element) {
        for (int i = 0; i < n; i++) {
            if(a[i] == element){
                return i;
            }
        }
        return -1;
    }

    private static int findMinimum(int[] a, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

    private static int findMaximum(int[] a, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i]> max){
                max = a[i];
            }
        }
        return max;
    }
}
