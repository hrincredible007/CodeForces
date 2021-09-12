package Divivsion_A;

import java.util.Scanner;

public class BalancedSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();

            if(str.length() == 1){
                System.out.println("-1 -1");
                continue;
            }                int flag = 0;

            for (int l = 0; l < n-1; l++) {
                int countA = 0;
                int countB = 0;

            for (int i = l; i < n; i++) {
                char ch = str.charAt(i);
                if (ch == 'a') {
                    countA++;
                }
                if (ch == 'b') {
                    countB++;
                }
                if(countA == countB){
                    System.out.println((l+1)+" "+(i+1));
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
            }
            if(flag == 0){
                System.out.println("-1 -1");
            }
        }
    }
}
