package Division_B;

import java.util.Scanner;


public class ConanAndAgasaPlayACardGame {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000000];
        for (int i = 0; i < n; i++) {
            int k  = sc.nextInt();
            arr[k]++;
        }

        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 && arr[i]%2==1){
                flag =1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Conan");
        }
        else{
            System.out.println("Agasa");
        }
    }
}
