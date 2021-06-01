package A2OJ.Division_A;

import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }


        // Bubble Sort
        for(int i=0 ;i<n; i++){
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }


        int s = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            s+=arr[i];
            c++;
            if(s>(float)sum/2){
                break;
            }
        }
        System.out.println(c);
    }
}
