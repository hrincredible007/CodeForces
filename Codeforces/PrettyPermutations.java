package Contests.CodeForcesRound728;

import java.util.Scanner;

public class PrettyPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr =   new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i+1;
            }
            int[] num = arr;
            if(n%2==0) {
                for (int i = 0; i < n; i += 2) {
                    swap(num, i, i + 1);
                }
            }
            else {
                for (int i = 0; i < n-1; i += 2) {
                    swap(num, i, i + 1);
                }
                int tt = num[n-1];
                num[n-1] = num[n-2];
                num[n-2] = tt;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(num[i]+" ");
            }
            System.out.println();

        }
    }

    private static void swap(int[] num, int i, int i1) {
        int t = num[i];
        num[i] = num[i+1];
        num[i+1] = t;
    }
}
