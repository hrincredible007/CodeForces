package Division_C;

import java.util.Arrays;
import java.util.Scanner;

public class LunarNewYearAndNumberDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int t=  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }*/
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));//2 3 5 8
        int low = 0;
        long ans = 0;
        int high=  arr.length-1;
        while(low<high){
            ans += (long) Math.pow((arr[low]+ arr[high]),2);
            low++;
            high--;
        }
        System.out.println(ans);
    }
}
