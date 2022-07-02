package Divivsion_A;

import java.util.Scanner;

public class XORMixUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int xor = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                xor = 0;
                for (int j = 0; j < n; j++) {
                    if(j!=i){
                        xor = xor^arr[j];
                    }
                }
                if(xor == arr[i]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
