package Divivsion_A;

import java.util.Scanner;

public class MakeAEqualToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            int oneA = 0;
            int zeroA = 0;
            int oneB = 0;
            int zeroB = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == 1){
                    oneA++;
                }else{
                    zeroA++;
                }
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
                if(arr2[i] == 1){
                    oneB++;
                }else{
                    zeroB++;
                }
            }
            int min = Math.min(Math.abs(oneA - oneB), Math.abs(zeroA - zeroB));
            int count = 0;
            int ss = min;
            for (int i = 0; i < n; i++) {
                if(arr[i]!=arr2[i]){
                    if(ss<0){
                        count = 1;
                       break;
                    }
                    ss--;
                }
            }
            int answer = count == 1? 1+min : min;
            System.out.println(answer);

        }
    }
}
