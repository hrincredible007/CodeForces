package A2OJ.Division_A;

import java.util.Scanner;
public class Games {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] host = new int[n];
        int[] guest = new int[n];
        for (int i = 0; i < n; i++) {
            host[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < n-1; i++) {//host: 100 42 5 100
            for (int j = i+1; j < n; j++) { // guest: 42 100 42 5
                if (host[i] == guest[j]) {
                    counter++;
                }
                if(guest[i] == host[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
