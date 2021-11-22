package Divivsion_A;

import java.util.Scanner;

public class BuyingTorches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            long x, y, k;
            x = sc.nextLong();   //  12     2
            y = sc.nextLong();   // 11      1
            k = sc.nextLong();   // 12      5

            long totalSticks = k+ y*k - 1;
            long res = totalSticks/(x-1);
            long tt = totalSticks%(x-1);

            if(tt!=0){
                res++;
            }
            System.out.println(res+k);
        }
    }
}
