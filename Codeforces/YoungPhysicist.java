package A2OJ.Division_A;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x, y, z;
        x = y = z = 0;
        int[][] arr = new int[t][3];

        

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }


        }
        for (int i = 0; i < t; i++) {
            x=x+arr[i][0];
            y=y+arr[i][1];
            z=z+arr[i][2];
        }
        if(x==0 && y==0 && z==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}