package Divivsion_A;

import java.util.Scanner;

public class FavouriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = arr.length-1;
            while (i<j){
                System.out.print(arr[i]+" "+arr[j]+" ");
                i++;
                j--;
            }
            if((n&1)==1)
            System.out.print(arr[n/2]);
            System.out.println();

        }
    }
}
