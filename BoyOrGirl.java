import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuilder s = new StringBuilder();
        str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!s.toString().contains(String.valueOf(ch))){
                s.append(ch);
            }
        }
        System.out.println(s.length()%2==0?"CHAT WITH HER!":"IGNORE HIM!");

    }
}
