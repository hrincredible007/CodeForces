package A;

import java.util.Scanner;

public class Little_Artem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sq = n* m;

            char[][] mat = new char[n][m];
            char ch = 'W';
            for(int i = 0; i< n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = ch;
                    ch = ch == 'W' ? 'B' : 'W';
                }
            }
            if(sq%2 == 0){
                mat[n-1][m-1] = 'B';
                mat[n-1][m-2] = 'B';
                mat[n-2][m-1] = 'B';
            }
            else{
                for(int i = 0; i< n; i++){
                    for (int j = 0; j < m; j++) {
                        mat[i][j] = mat[i][j] == 'W'?'B':'W';
                    }
                }
            }

            for(char[] e: mat){
                for (char c : e) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
}
