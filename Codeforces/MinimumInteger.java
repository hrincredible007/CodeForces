package Divivsion_A;

import java.util.Scanner;
public class MinimumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- >0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            if(d>=l){
                System.out.println(((r+d)/d)*d);
            }
            else {
                System.out.println(d);
            }
        }
    }
}
