package Divivsion_A;

import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0, evenPos = 0;
        int odd=  0, oddPos = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if((arr[i]%2)==0){
                even++;
                evenPos = i;
            }
            else{
                odd++;
                oddPos = i;
            }
        }
        if(odd==1){
            System.out.println(oddPos+1);
        }
        else{
            System.out.println(evenPos+1);
        }
    }
}
