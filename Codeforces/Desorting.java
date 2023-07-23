package A;

import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            boolean is = isArraySorted(nums, n);
            if(is){
                System.out.println(0);
                continue;
            }
            int diff = (int)1e9;
            for(int i = 0; i< n-1; i++){
                diff = Math.min(diff, nums[i+1] -nums[i]);
            }
            if(diff == 0){
                System.out.println(1);
                continue;
            }
            System.out.println(1+(diff/2));
        }
    }

    private static boolean isArraySorted(int[] nums, int n) {
        for(int i = 0; i< n-1; i++){
            if(nums[i] > nums[i+1]){
                return true;
            }
        }
        return false;
    }
}