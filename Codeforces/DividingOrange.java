package Divivsion_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DividingOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        int[] z = new int[n*k+1];
        for (int i = 1; i < z.length; i++) {
            z[i] = 1;
        }
        for (int i = 0; i < k; i++) {// 1 2 3 4
            arr[i] = sc.nextInt();
            z[arr[i]] = 0;
        }
        List<Integer> l =new ArrayList<>();
        for (int i = 1; i < z.length; i++) {
            if(z[i]==1){
                l.add(i);
            }
        }
        int j = 0, man;
        for (int value : arr) {
            System.out.print(value + " ");
            man = n;
            while (man-- != 1) {
                System.out.print(l.get(j++) + " ");
            }System.out.println();
        }
    }
}
