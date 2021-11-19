package Divivsion_A;

import java.util.Arrays;
import java.util.Scanner;

public class ContestStart {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int k = sc.nextInt();
        while(k-- >0){
            int n, x, t;
            n = sc.nextInt();
            x = sc.nextInt();
            t = sc.nextInt();


            int p = Math.min(n, t/x);

            if(p<1){
                System.out.println(0);
                continue;
            }
            long result = ((long)p*(p-1)/2) + ((long)p*(n-p));
            System.out.println(result);
        }

    }
}
