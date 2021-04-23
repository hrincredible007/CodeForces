package A2OJ.Division_A;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        int n = str.length();
        String wd = "hello";

        int j = 0;
        int hx = 0;
        for(int i =0;i<n;i++) {
            if(str.charAt(i)==wd.charAt(j)){
                j++;
                hx++;
                System.out.println(str.charAt(i));
                if(j==5){
                    break;
                }
            }
        }
        if(hx == 5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}