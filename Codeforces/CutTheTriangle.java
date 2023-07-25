//package A;

import java.util.Scanner;

public class CutTheTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=  sc.nextInt();
        while(t-- > 0){
//            int n = sc.nextInt();
            int[][] nums = new int[3][2];
            for(int i = 0; i< 3; i+=1){
                nums[i][0] = sc.nextInt();
                nums[i][1] = sc.nextInt();
            }
            int res = 0;
            if(nums[0][0] == nums[1][0] || nums[0][1] == nums[1][1]){
                res+=1;
            }if(nums[1][0] == nums[2][0] || nums[1][1] == nums[2][1]){
                res+=1;
            }if(nums[2][0] == nums[0][0] || nums[2][1] == nums[0][1]){
                res+=1;
            }
            if(res != 2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
