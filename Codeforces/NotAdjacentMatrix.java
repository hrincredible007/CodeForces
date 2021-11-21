package Division_C;

import java.util.Arrays;
import java.util.Scanner;

public class NotAdjacentMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            if(n ==2){
                System.out.println(-1);
                continue;
            }
            if(n == 1){
                System.out.println(1);
                continue;
            }
            int[][] arr = new int[n][n];
            int c = 1;
            for(int i= 0 ;i<n;i++){
                arr[i][i] = c++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (i == j) {
                        break;
                    }
                    if (i == 0) {
                        arr[j][i] = c++;
                        arr[i][j] = c++;
                    } else {
                        arr[i][j] = c++;
                        arr[j][i] = c++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
