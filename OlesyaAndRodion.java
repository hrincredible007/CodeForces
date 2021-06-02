package A2OJ.Divivsion_A;

import java.util.Scanner;

public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t =  sc.nextInt();
        if(n==1 && t==10){
            System.out.println(-1);
        }
        else{
            System.out.print(t);
            if(t== 10){
                for (int i = 0; i < n-2; i++) {
                    System.out.print(0);
                }
            }
            else{
                for (int i = 0; i < n-1; i++) {
                    System.out.print(0);
                }
            }
        }

    }
}
