package A2OJ.Divivsion_A;
import java.util.Scanner;

public class TwoBagsOfPotataoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, k, n;
        y = sc.nextInt();//10T
        k = sc.nextInt();//6
        n = sc.nextInt();//11
        int x;
        x = y%k;
        x = k-x;
        int pp =n-y;
        if(x<=pp){
            System.out.print(x+" ");
            x+=k;
            while (x<=pp){
                System.out.print(x+" ");
                x+=k;
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
