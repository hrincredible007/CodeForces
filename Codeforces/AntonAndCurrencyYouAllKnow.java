package Division_B;

import java.util.Scanner;

public class AntonAndCurrencyYouAllKnow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char last = str.charAt(len-1);
        int lastNumeric = Character.getNumericValue(last);
        int pos = -1;
        int even = 0;

        for (int i = 0; i < len; i++) {
            int ch = Character.getNumericValue(str.charAt(i));
            if(ch%2==0){
                even++;
            }
        }
        if(even==0){
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < len; i++) {
            int ch = Character.getNumericValue(str.charAt(i));
            if(ch%2==0 && lastNumeric > ch){
                pos = i;
                break;
            }
        }
        if(pos!=-1) {
            String wd = str.substring(0, pos) + last + str.substring(pos + 1, len - 1) + str.charAt(pos);
            System.out.println(wd);
        }
        else{
            int m = -1;
            for (int i = len-2; i >=0 ; i--) {
                int ch = Character.getNumericValue(str.charAt(i));
                if(ch%2 ==0){
                    m = i;
                    break;
                }
            }
            String wd = str.substring(0,m)+last+str.substring(m+1, len-1)+str.charAt(m);
            System.out.println(wd);
        }
    }
}