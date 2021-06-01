package A2OJ.Division_A;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vow = "aeiouyAEIOUY";
        String str;


        str = sc.next();
        String wd ="";
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!= 'Y' && ch!='a'
            && ch!='e' && ch!='i' && ch!= 'o'&& ch!= 'u'&& ch!= 'y'){
                wd +="."+ch;
            }
        }
        System.out.println(wd.toLowerCase());
    }
}
