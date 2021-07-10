package Division_C;

import java.util.Scanner;
import java.util.Vector;

public class Pair_Programming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            Vector<Integer> vector = new Vector<>();
            int low = 0;
            int high = 0;
            while(true){
                if(low<n && k>=a[low]){
                    if(a[low] == 0) {
                        k++;
                    }
                    vector.add(a[low]);
                    low++;
                }
                else if(high<m && k>= b[high]){
                    if(b[high] == 0){
                        k++;
                    }
                    vector.add(b[high]);
                    high++;
                }
                else{
                    break;
                }
            }
            if(low<n || high<m){
                System.out.println(-1);
                continue;
            }
            for (int e: vector) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
