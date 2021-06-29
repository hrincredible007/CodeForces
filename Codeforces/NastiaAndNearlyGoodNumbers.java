package Divivsion_A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NastiaAndNearlyGoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-->0){
            long A, B;
            A = sc.nextLong();
            B = sc.nextLong();
            if(B==1) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(A+" "+A*B +" " +A*(1+B));
            }
        }
    }
}
