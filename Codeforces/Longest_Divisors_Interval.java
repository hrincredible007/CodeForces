//package B;

import java.util.Scanner;

public class Longest_Divisors_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long count = 0;
            long flag = 0;

            for (long i = 1; i <= n ; i++) {
                if(n%i == 0){
                    count+=1;
                }
                else{
                    System.out.println(count);
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                continue;
            }
            System.out.println(count);

        }
                
    }
}
