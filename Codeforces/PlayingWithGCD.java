package Division_B;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayingWithGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(n == 1){
                System.out.println("YES");
                continue;
            }
            int flag = 0;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[0]);
            for (int i = 0; i < n-1; i++) {
                list.add(arr[i]* arr[i+1]/gcd(arr[i], arr[i+1]));
            }

            list.add(arr[n-1]);
            int ans = 0;
            int p = 0;
            for (int i = 0; i < list.size() -1; i++) {
                ans = gcd(list.get(i), list.get(i+1));
                if(ans != arr[p++]){
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("YES");
            }
        }
    }

    private static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
}
