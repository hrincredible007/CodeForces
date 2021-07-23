package Division_C;

import java.util.Scanner;

public class CelexUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int x1, y1, x2, y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1 == x2 || y1 == y2){
                System.out.println(1);
            }
            else{
                System.out.println((long) Math.abs(x1- x2)* Math.abs(y1- y2)+1);

            }
        }
    }
}
