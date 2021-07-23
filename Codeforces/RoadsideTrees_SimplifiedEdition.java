package Division_B;

import java.util.Scanner;

public class RoadsideTrees_SimplifiedEdition {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }// 2 2 1 1 1
        int steps = n+n-1+arr[0];

        for (int i = 0; i < n-1; i++) {
            steps += Math.abs(arr[i] - arr[i+1]);
        }
        System.out.println(steps);
    }
}
