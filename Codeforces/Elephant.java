package Divivsion_A;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n/5;

        if(n%5!=0){
            result+=1;
        }

        System.out.println(result);
    }
}
