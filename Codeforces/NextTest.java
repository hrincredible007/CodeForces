package Divivsion_A;

import java.util.Scanner;

public class NextTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }// 1 7 2 4 0
        for (int i = 1; i < n; i++) {
            int temp = a[i];//7
            int j = i-1;
            while(j>=0 && temp<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        int i;
        for (i = 0; i < n; i++) {
            if(i+1!=a[i]){
                break;
            }
        }
        System.out.println(i+1);
    }
}
