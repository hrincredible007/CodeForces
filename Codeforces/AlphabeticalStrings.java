package Division_B;

import java.util.Scanner;
public class AlphabeticalStrings {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int n = str.length();
            int index = str.indexOf('a');
            if(index==-1){
                System.out.println("NO");
                continue;
            }
            char ch = 'b';
            int L= index-1;
            int R = index+1;
            int flag = 0;
            while(L>=0 || R<str.length()){
                if(L>=0 && str.charAt(L)==ch){
                    L--;
                }
                else if( R<str.length() && str.charAt(R)==ch){
                    R++;
                }
                else{
                    flag = 1;
                    break;
                }
                ch++;
            }
            if(flag==1){
                System.out.println("NO");

            }
            else{
                System.out.println("YES");
            }
        }
    }
}
