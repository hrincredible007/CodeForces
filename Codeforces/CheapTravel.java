package Divivsion_A;

import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a, b;
        n = sc.nextInt();// total no. of tickets Ann wants to buy 9
        m = sc.nextInt();// no. of special tickets 3
        a = sc.nextInt();// price of a single ordinary ticket  3
        b = sc.nextInt();// price of m ticket ride   10
        int total = 0;

        if(b/m >=a){
            total = n*a;
        }
        else{
            total = (n/m)*b;

            total = total + Math.min(b, a*(n%m));
        }

        System.out.println(total);
    }
}
