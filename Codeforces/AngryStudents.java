package Divivsion_A;

import java.util.Scanner;

public class AngryStudents {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t=  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str=  sc.next();
            if(str.length()<=1){
                System.out.println(0);
                continue;
            }
            if(str.indexOf('A')!=-1) {
                str = str.substring(str.indexOf('A'));
            }
            else{
                System.out.println(0);
                continue;
            }
            if(str.length()<=1){
                System.out.println(0);
                continue;
            }
            int count = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch=='P'){
                    count++;
                }
                else{
                    max = Math.max(max, count);
                    count = 0;
                }
            }max = Math.max(count, max);
            System.out.println(max);
        }
    }
}
