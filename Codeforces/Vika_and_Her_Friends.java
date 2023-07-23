package A;

import java.util.Scanner;

public class Vika_and_Her_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean result = true;
            for(int i = 0; i< k; i+=1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if((Math.abs(a- x) + Math.abs(b- y))%2 == 0){
                    result = false;
                }
            }
            System.out.println(result?"YES":"NO");
        }
    }
}
