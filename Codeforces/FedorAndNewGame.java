package Division_B;

import java.util.Scanner;

public class FedorAndNewGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =  sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int Fedor = sc.nextInt();
        int result = 0;
        for (int i = 0; i < m; i++) {
            int x = Fedor^arr[i];
            int count = 0;
            int helping = arr[i];
            while(x!=0){
                count+=(x&1);
                x>>=1;   //helping/=2;
            }
            //System.out.println("Count: "+count);
            if(count<=k){
                result++;
            }
        }
        System.out.println(result);
    }
}
