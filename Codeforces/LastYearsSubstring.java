package Division_B;

import java.util.Scanner;

public class LastYearsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int flag = 1;
            for (int i = 0; i <= 4; i++) {
                String s = str.substring(0, i) + str.substring(n - 4 + i);
                if(s.equals("2020")){
                    System.out.println("YES");
                    flag = 0;
                    break;


                }
            }

            if(flag == 1 ){
                System.out.println("NO");
            }

        }
    }
}
