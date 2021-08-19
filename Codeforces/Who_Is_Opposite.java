package Division_B;

import java.util.Scanner;

public class Who_Is_Opposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int a, b ,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int res = Math.max(a, b)+ Math.abs(a- b) - Math.min(a,b);
            //System.out.println("RES: "+res);
            if(res<Math.max(Math.max(a, b),c)){
                System.out.println(-1);
            }
            else {
                int mn = c + res / 2;
                if(mn>res){
                    mn = mn-res;
                }
                System.out.println(mn);
            }
        }
    }
}
