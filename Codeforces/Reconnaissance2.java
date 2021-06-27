package Divivsion_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int min = Math.abs(arr[0] - arr[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            min = Math.min(min, abs);
            list.add(abs);
        }
        int res = 0;
        list.add(min);
        for (int i = 0; i < list.size(); i++) {//01 12  23  34  45  51
            if (min == list.get(i)) {
                res = i;
                break;
            }
        }
        if (res == n - 1) {
            System.out.println(res+1+" "+1);
        }
        else{
            System.out.println(res+1+" "+(res+2));
        }
    }
}
