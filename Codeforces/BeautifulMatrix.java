package A2OJ.Division_A;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int posI = 0;
        int posJ = 0;
        for(int i=0;i<5;i++){


            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){  // 1 4 //
                    posI = i;
                    posJ = j;
                }
            }
            
        }
        System.out.println(Math.abs(2-posI)+Math.abs(2-posJ));
    }
}
