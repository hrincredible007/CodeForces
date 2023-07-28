package B;

import java.util.Scanner;

public class Settlement_of_Guinea_Pigs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int known = 0, unknown = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if(nums[i] == 1){
                    unknown += 1;
                }
                else{
                    known += unknown;
                    unknown = 0;
                }
                int res = (known/2)+1;
                if(known == 0){
                    res -=1;
                }
                max = Math.max(max, unknown + res);
            }
            System.out.println(max);
        }
    }
}
