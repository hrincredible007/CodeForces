package A;

import java.util.Scanner;

public class Dalton_the_teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if(nums[i] == i+1){
                    count+=1;
                }
            }
            if(count%2 == 0){
                System.out.println(count/2);
            }
            else{
                System.out.println(count/2+1);
            }
//            System.out.println(count);

        }
    }
}
