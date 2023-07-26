package B;

import java.util.ArrayList;
import java.util.Scanner;

public class Keep_It_Beautiful {
    static int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            flag = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                int count = sol(list, nums[i]);

                System.out.print(count);
                //System.out.println(list+"\t"+flag);
            }
            System.out.println();
        }
    }
    public static int sol(ArrayList<Integer> list, int val) {
        int n = list.size();
        if(n == 0){
            list.add(val);
            return 1;
        }
        if(flag == 1){
            if(list.get(list.size()- 1) <= val && list.get(0) >= val){
                list.add(val);
                return 1;
            }
            return 0;
        }
        else {
            if (list.get(n - 1) <= val) {
                list.add(val);
                return 1;
            } else {
                if (list.get(0) >= val) {
                    //System.out.println(true);
                    flag = 1;
                    list.add(val);
                    return 1;
                }
            }
        }
        return 0;
    }

}
