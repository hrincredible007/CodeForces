package Divivsion_A;

import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < p; i++) {
            int k = sc.nextInt();
            list.add(k);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int pp = sc.nextInt();
            list.add(pp);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <=n ; i++) {
            set.add(i);
        }
        if(set.size()==list.size()){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
