package Division_B;

import java.util.Scanner;

public class PrinzessinDerVerureteilung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int k = sc.nextInt();
            String str = sc.next();
            StringBuilder wd= new StringBuilder();
            int flag = 0;
            for (int i = 0; i < 26; i++) {
                wd.append((char) ('a' + i));
                if(!str.contains(wd.toString())){
                    System.out.println(wd);
                    flag = 1;
                    break;
                }
                wd = new StringBuilder();
            }
            if(flag ==1){
                continue;
            }
            wd = new StringBuilder();
            int f = 0;
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    wd.append((char) ('a' + i));
                    wd.append((char) ('a' + j));
                    if(!str.contains(wd.toString())){
                        System.out.println(wd);
                        f = 1;
                        break;
                    }
                    wd = new StringBuilder();
                }
                if(f == 1){
                    break;
                }
            }
            if(f==1){
                continue;
            }
            int fk = 0;
            wd = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    for (int l = 0; l < 26; l++) {
                        wd.append((char) ('a' + i));
                        wd.append((char) ('a' + j));
                        wd.append((char) ('a' + l));
                        if(!str.contains(wd.toString())){
                            System.out.println(wd);
                            fk = 1;
                            break;
                        }
                        wd = new StringBuilder();
                    }
                    if(fk==1){
                        break;
                    }
                }
                if(fk==1){
                    break;
                }
            }


        }
    }
}