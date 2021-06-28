package A2OJ.Division_A;

import java.util.Scanner;

public class TitForTat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n,k;
            n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n];
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int[] ra = bubbleSort(arr, n);

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]+",  ");
            }
        }
    }
    public static int[] bubbleSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

