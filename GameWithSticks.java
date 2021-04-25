package A2OJ.Division_A;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        String winner = "Akshat";
        if(n==1 || m==1){
            winner = "Akshat";
        }
        else if(Math.min(n,m)%2 ==0){
            winner = "Malvika";
        }
        System.out.println(winner);
    }
}
