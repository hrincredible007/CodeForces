//package B;

import java.util.Scanner;

public class Vaccination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int i = 0;
            int total = 0;
            while(i < n){
                int remaining_vaccines = k;
                int days_curr_Patient_can_delay = nums[i]+ w;
                while(i< n && nums[i] <= days_curr_Patient_can_delay && remaining_vaccines>0){
                    i+=1;
                    remaining_vaccines-=1;
                }
                total+=1; // increase the vaccine pack

                int vaccines_valid = days_curr_Patient_can_delay+d;
                while(i< n && remaining_vaccines>0 && nums[i]<=vaccines_valid){
                    i+=1;
                    remaining_vaccines-=1;
                }
            }
            System.out.println(total);
        }
    }
}
