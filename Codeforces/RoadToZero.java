package A2OJ.Divivsion_A;

import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a, b;
            a = sc.nextLong();
            b = sc.nextInt();
            long max = Math.max(x, y);
            long min = Math.min(x, y);
            long ans = 0;


            if(2*a<=b){
                ans = min*a*2+(max-min)*a;
            }
            else{
                ans = min*b+(max-min)*a;
            }
            System.out.println(ans);
        }
    }
}
