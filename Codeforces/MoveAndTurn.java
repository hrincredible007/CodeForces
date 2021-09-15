package Division_B;

import java.util.HashSet;
import java.util.Scanner;

public class MoveAndTurn {

    static HashSet<String> stringHashSet = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = 0;

        if(n==1){
            System.out.println(4);
            System.exit(0);
        }
        if(n%2==0){
            System.out.println((n/2+1)*(n/2+1));// 4  9  16....
        }
        else{
            System.out.println(2*(n/2+1)*(n/2+2));// 12  24  40 //  6  12   20
        }


    }
}