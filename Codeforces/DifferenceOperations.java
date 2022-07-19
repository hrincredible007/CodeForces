package Divivsion_A;

import java.util.Scanner;

public class DifferenceOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int flag = 0;
            for(int i = 1;i<=n-1;i++){
                if(arr[i]%arr[0]!=0){
                    flag = 1;
                    break;
                }
            }
            System.out.println(flag==0?"YES":"NO");
        }
    }
}
