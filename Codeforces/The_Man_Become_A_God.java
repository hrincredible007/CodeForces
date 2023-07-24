package A;

import java.util.*;

public class The_Man_Become_A_God {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0; i< n-1; i+=1){
                int a = Math.abs(nums[i] - nums[i+1]);
                sum+=a;
                list.add(a);
            }
            Collections.sort(list);
            //8 3 8 3 5
            //
            int ind = list.size()-1;
            for(int i = 1; i< k; i+=1){
                sum -= list.get(ind);
                ind -=1;
            }
            System.out.println(sum);
            //6 3
            //1 9 12 4 7 2
            // 8 3 8 3 5

            //12 8
            //1 9 8 2 3 3 1 8 7 7 9 2
            // . 1. 1 0. 0 .
            //1
        }
    }
}
