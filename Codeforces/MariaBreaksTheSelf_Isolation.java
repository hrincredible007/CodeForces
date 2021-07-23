package Contests.Virtual.CodeForcesRound645;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MariaBreaksTheSelf_Isolation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int flag = 0;
            //System.out.println(Arrays.toString(arr));
            for (int i = n-1; i >=0 ; i--) {
                if(arr[i]<= i+1){
                    flag = i+1;
                    break;
                }
            }
            if(flag>0){
                System.out.println(flag+1);
            }
            else{
                System.out.println(1);
            }

        }
    }
}
