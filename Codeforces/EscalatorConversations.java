//package A;

import java.util.Scanner;

public class EscalatorConversations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); //people
            int m = sc.nextInt(); // steps
            int k = sc.nextInt(); //height
            int h = sc.nextInt(); // vlad's Herto
            int[] nums = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                int abs = Math.abs(h - nums[i]);
                if(nums[i] != h && abs <= (m-1)*k && abs % k == 0){
                    count+=1;
                }
            }
            System.out.println(count);


        }
    }
}
