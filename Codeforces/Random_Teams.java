//package B;

import java.util.Scanner;

public class Random_Teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- >0){
            long n = sc.nextLong();
            long m = sc.nextLong();
//        System.out.println((long)1000000000 *(1000000000 -1)/2);
            long max = 0;
            long min = 0;
            long res = n - (m-1);
            max = res*(res-1)/2;
            if(n%m == 0){
                long cc = n/m;
                min = m*cc*(cc-1)/2;
            }
            else{

                long cc = n/m;
                long ext = n%m;
                min = (long)((m-ext)*(long)cc*(cc-1)/2)+(ext*(cc+1)*cc/2);
            }
            System.out.println(min +" "+max);
//        }
    }
}
