package A;

import java.util.Scanner;

public class A_characteristic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int res = -2;

            for(int i = 0; i< n; i++){
                int ans = i*(i-1)/2;
                ans += (n-i-1)*(n-i)/2;
                if(ans == k){
                    res = i;
                    break;
                }
            }
            if(res == -2){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for(int i = 0; i< n; i++){
                if(i< res){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("-1 ");
                }
            }
            System.out.println();
        }
    }
}
