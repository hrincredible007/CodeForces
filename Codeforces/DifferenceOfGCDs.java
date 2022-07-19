package Division_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferenceOfGCDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n, l, r;
            n = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int flag = 0;
            list.add(l);
            for(int i = 2;i<=n;i++){
                if(l%i==0){
                    list.add(l);
                }
                else{
                    int j = l/i;
                    int kk = (j+1)*i;
                    if(kk<=r) {
                        list.add(kk);
                    }
                    else{
                        break;
                    }
                }
            }
            if(list.size() == n){
                System.out.println("YES");
                for(int e: list){
                    System.out.print(e+" ");
                }
                System.out.println();

            }
            else{
                System.out.println("NO");
            }
        }
    }
}
