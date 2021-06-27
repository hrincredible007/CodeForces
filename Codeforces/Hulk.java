package Divivsion_A;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "I hate";
        String s = "I love that";
        if(n==1){
            System.out.println(str+" it");
            System.exit(0);
        }
        for (int i = 2; i < n; i+=2) {
            str = str+" that "+s+" I hate";
        }

        if(n%2==0){
            System.out.println(str+" that I love"+" it");
        }
        else {
            System.out.println(str + " it");
        }
    }
}
