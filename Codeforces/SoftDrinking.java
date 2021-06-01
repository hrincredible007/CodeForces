package A2OJ.Divivsion_A;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n = sc.nextInt(); // friends
        k = sc.nextInt(); // bottles of softDrinks
        l = sc.nextInt(); // l milliliters of drink
        c = sc.nextInt(); // c limes
        d = sc.nextInt(); // d slices
        p = sc.nextInt(); // salt of p grams
        nl = sc.nextInt(); //nl milliliters
        np = sc.nextInt(); // np grams salt
        int totalMilliliters = k*l/nl;
        int totalSlices = c*d;
        int salt = p/np;
        int answer;
        int kkk = Math.min(totalMilliliters, totalSlices);
        answer = Math.min(kkk,salt);
        System.out.println(answer/n);
    }
}
