package Contests.Virtual.CodeForcesRound645;

import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println((int)Math.ceil(n*m/2.0));

        }
    }
}
