package A2OJ.Division_A;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            a[arr[i]-1] = i+1;
        }
        for (int i : a) {
            System.out.print(i + " ");

        }

    }
}
