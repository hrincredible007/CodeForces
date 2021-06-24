package Divivsion_A;

import java.util.Scanner;

public class Sleuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();   // CVV: 825
        String vowel = "AEIOUY";  // Card No. : 5103 7203 4435 7296  // oct 23
        int flag = 1;
        for (int i = str.length()-1; i >-1; i--) {
            char ch = str.charAt(i);
            if((ch>=65 && ch<=90)){
                if(ch=='A' || ch=='E' || ch=='I' || ch== 'O' || ch=='U' || ch=='Y'){
                    flag =0;
                }
                else{
                    flag = 100;
                }
                break;
            }

        }
        if(flag==100){
            System.out.println("NO");
        }
        else if(flag==0){
            System.out.println("YES");
        }
    }
}
