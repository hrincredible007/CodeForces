package B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_Merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int[] nums2 = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                nums2[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> hashMap1 = new HashMap<>();
            HashMap<Integer, Integer> hashMap2 = new HashMap<>();
            int ind = 0;
            while(ind < n){
                int curr = nums[ind];
                int cnt = 0;
                while(ind < n && curr == nums[ind]){
                    ind++;
                    cnt++;
                }
                hashMap1.put(curr, Math.max(cnt, hashMap1.getOrDefault(curr, 0)));
            }
//            System.out.println(hashMap1);
            ind = 0;
            while(ind < n){
                int curr = nums2[ind];
                int cnt = 0;
                while(ind < n && curr == nums2[ind]){
                    ind++;
                    cnt++;
                }
                hashMap2.put(curr, Math.max(cnt, hashMap2.getOrDefault(curr, 0)));
            }
//            System.out.println(hashMap2);
            int max = 0;
            for(Map.Entry<Integer, Integer> e: hashMap1.entrySet()){
                int key = e.getKey();
                int val = e.getValue();
                max = Math.max(max, val + hashMap2.getOrDefault(key, 0));
            }

            for(Map.Entry<Integer, Integer> e: hashMap2.entrySet()){
                int key = e.getKey();
                int val = e.getValue();
                max = Math.max(max, val + hashMap1.getOrDefault(key, 0));
            }
            System.out.println(max);
        }
    }
}
