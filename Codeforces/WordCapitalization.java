import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        char ch = str.charAt(0);
        int k = (int)ch;
        if(k>=97 && k<=122){
            k-=32;
        }
        s = s+(char)k;
        for (int i = 1; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            s = s+ch1;
        }
        System.out.println(s);
    }
}
