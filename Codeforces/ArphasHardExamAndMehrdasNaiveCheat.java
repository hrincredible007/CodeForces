package Divivsion_A;

import java.util.Scanner;

public class ArphasHardExamAndMehrdasNaiveCheat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(1);
        }
        else if(n%4==0){
            System.out.println(6);
        }
        else if(n%4==1){
            System.out.println(8);
        }
        else if(n%4==2){
            System.out.println(4);
        }
        else if(n%4==3){
            System.out.println(2);
        }
    }
}
