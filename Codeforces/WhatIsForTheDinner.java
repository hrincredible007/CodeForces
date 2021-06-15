package Divivsion_A;

import java.util.Scanner;

public class WhatIsForTheDinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m ,k;
        n = sc.nextInt(); // total amt of teeth
        m = sc.nextInt();  // total tooth row
        k  =sc.nextInt();  //  amount of crucians
        int[] arr = new int[m+1];
        for (int i = 1; i <= m; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            int r, c;
            r = sc.nextInt();  // index of the row
            c = sc.nextInt(); // residual viability
            int ans = Math.min(arr[r],c);
            arr[r] = ans;
        }
        int s = 0;
        for (int i = 1; i <= m ; i++) {
            s+=arr[i];
        }
        System.out.println(Math.min(s, k));

    }
}
