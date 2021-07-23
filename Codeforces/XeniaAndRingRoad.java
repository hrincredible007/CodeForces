package Division_B;

import java.util.*;

public class XeniaAndRingRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long[] arr = new long[(int) m];

        for (int i = 0; i < m; i++) {
            arr[i]  =  sc.nextLong();
        }
        long steps = arr[0] -1;
        long curr = 0;
        //System.out.println(steps);
        for (int i = 0; i < m-1; i++) {
            //System.out.println("i \t"+i);
            curr =0;
            if(arr[i] <= arr[i+1]){
                curr = (arr[i+1] - arr[i]);
                steps += curr;
                //System.out.println(steps);

            }
            else{
                steps += n - arr[i];
                steps += arr[i+1];
                //System.out.println(steps);

            }

        }
        System.out.println(steps);

    }
}