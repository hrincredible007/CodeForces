package A;

import java.util.Scanner;

public class Bestie {
    static int gcd_cal(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd_cal(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int gcd = 0;
            for(int i = 0; i< n; i+=1){
                nums[i] = sc.nextInt();
                gcd = gcd_cal(gcd, nums[i]);
            }
//            System.out.println("GCD\t"+gcd);
            if(gcd == 1){//0
                System.out.println(0);
                continue;
            }
            if(n == 1){
                System.out.println(1);
                continue;
            }
            int min = 3;
            if(gcd_cal(gcd, n) == 1){
                min = 1;
                System.out.println(min);
            }
            else if(gcd_cal(gcd, n-1) == 1){
                min = 2;
                System.out.println(min);
            }
            else{
                System.out.println('3');
            }
//            System.out.println(min);
//4
//5 10 15 20
        }
    }
}
