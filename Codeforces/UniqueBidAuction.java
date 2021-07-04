package Division_B;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UniqueBidAuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            TreeMap<Integer, Integer> hashMap = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1 );
            }
            //System.out.println(hashMap);

            int flag = 1;
            int count = -1;
            for (Map.Entry<Integer, Integer> e: hashMap.entrySet()) {
                if(e.getValue()==1){
                    flag = 0;
                    count = e.getKey();
                    break;
                }
            }
            if(flag == 1){
                System.out.println(-1);
            }
            else {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == count) {
                        System.out.println(i+1);
                        break;
                    }
                }
            }

        }
    }
}
