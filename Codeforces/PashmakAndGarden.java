package Divivsion_A;

import java.util.Scanner;

public class PashmakAndGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,  y1, x2 , y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        int distX = Math.abs(x2 - x1);
        int distY = Math.abs(y2 - y1);
        if(distX!=0 && distY!=0 && distY!=distX){
            System.out.println(-1);

        }
        else{
            if(distX==distY){
                int k = (y1+distX);
                int kk = (x1+distX);
                if(k>y2){
                    k = k-distX-distX;
                }
                if(x1 == x2+distX){
                    kk =kk - distX-distX;
                }
                System.out.println(x1+" "+k+" "+kk+" "+y1);
            }
            else if((distX==0 || distY ==0)) {
                if (x1 - x2 == 0) {
                    System.out.println((x1+distX + distY)+" "+y1+" "+(x2+distX+distY)+" "+y2);

                } else if (y2 - y1 == 0) {
                    System.out.println(x1 + " " + (y1 + distX + distY) + " " + x2  + " " + (y2+distX+distY));
                }
            }
        }
    }
}
