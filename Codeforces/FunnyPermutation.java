package Division_B;

import java.util.ArrayList;
import java.util.Scanner;

public class FunnyPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            // 1 2 3 4 5 6
            // 5 6 1 2 3 4
            if(n<4){
                if(n == 2){
                    System.out.println("2 1");
                }else if(n == 3){
                    System.out.println("-1");
                }continue;
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(n-1);
            list.add(n);
            for (int i = 1; i <= n-2; i++) {
                list.add(i);
            }
            int c = 0;
            for (int i = 1; i < list.size()-1; i++) {
                if(i != list.get(i)){
                    if(Math.abs(list.get(i-1)- list.get(i)) == 1 ||
                            Math.abs(list.get(i+1)- list.get(i)) == 1 ){
                        c++;
                    }
                }
            }
            if(0 != list.get(0)){
                if(Math.abs(list.get(1)- list.get(0)) == 1 ){
                    c++;
                }
            }if(n-1 != list.get(n-1)){
                if(Math.abs(list.get(n-1)- list.get(n-2)) == 1 ){
                    c++;
                }
            }
            if (c == n){
                for(int e: list)
                    System.out.print(e+" ");
            }
            else{
                System.out.print("-1");
            }
            System.out.println();
        }
    }
}

