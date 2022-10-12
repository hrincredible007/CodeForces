package Divivsion_A;

import java.util.Scanner;

public class CompareTShirtSizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String a = sc.next();
            String b = sc.next();
            int s1 = a.charAt(a.length() -1);
            int s2 = b.charAt(b.length() -1);
            if(a.charAt(a.length() -1) == b.charAt(b.length() -1)){
                if(a.length() > b.length()){
                    System.out.println(s1 == 'L' ?">": "<");
                }
                else if(a.length() < b.length()){
                    System.out.println(s1 == 'L' ?"<": ">");
                }else{
                    System.out.println("=");
                }
            }
            else{
                if(s1 == 'L'){
                    System.out.println(">");
                }
                else if(s2 == 'L'){
                    System.out.println("<");
                }
                else if(s1 == 'S'){
                    System.out.println("<");
                }
                else if(s2 == 'S'){
                    System.out.println(">");
                }

            }
        }
    }
}
