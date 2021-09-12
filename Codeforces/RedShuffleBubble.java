package Divivsion_A;

import java.util.Scanner;

public class RedShuffleBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String R = sc.next();
            String B = sc.next();
            int countR = 0;
            int countB = 0;
            int i = 0;
            while(i<n){
                if(R.charAt(i)>B.charAt(i)){
                    countR++;
                }
                else if(R.charAt(i)<B.charAt(i)){
                    countB++;
                }
                i++;
            }
            if(countR>countB){
                System.out.println("RED");
                continue;
            }
            if(countB>countR){
                System.out.println("BLUE");
                continue;
            }
            System.out.println("EQUAl");
        }
    }
}
