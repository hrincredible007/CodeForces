//package C;

import java.util.Scanner;

public class TilesComeback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            if (nums[0] == nums[n-1]) {
                int cnt = 0, flag = 0;
                for (int i = 0; i < n; i++) {
                    if(nums[0] == nums[i]){
                        cnt++;
                    }
                    if(cnt%k == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                continue;
            }
            int fst = -1;
            int lst = -1, count = 0;
            for (int i = 0; i < n; i++) {
                if(nums[0] == nums[i]){
                    count+=1;
                }
                if(count%k == 0){
                    fst = i;
                    break;
                }
            }
            count = 0;
            for (int i = n-1; i >= 0; i-=1) {
                if(nums[n-1] == nums[i]){
                    count+=1;
                }
                if(count%k == 0){
                    lst = i;
                    break;
                }
            }
            if(fst != -1 && lst != -1 && fst < lst){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
