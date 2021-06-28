package A2OJ.Division_A;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String str1 = sc.next().toLowerCase();


        if(str.length() != str1.length()){
            System.exit(0);
        }
        int flag = 0;
        for(int i =0;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str1.charAt(i);
            if(ch1<ch2){
                flag=1;
                System.out.println("-1");
                break;
            }
            else if(ch1>ch2){
                flag=1;
                System.out.println("1");
                break;
            }
        }if(flag==0){
            System.out.println("0");
        }
    }
}
