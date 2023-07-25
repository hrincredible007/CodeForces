package A;

import java.util.Scanner;

public class Politics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            String[] str = new String[n];
            for(int i = 0; i< n; i+=1){
                str[i] = sc.next();
            }
            int count = 0;
            for(int i = 1; i< n; i+=1){
                if(str[0].equals(str[i])){
                    count+=1;
                }
            }
            System.out.println(count+1);
        }
    }
}