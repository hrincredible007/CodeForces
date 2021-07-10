package Contests.CodeForcesRound731;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestPathWithAnObstacle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            List<Integer> A = new ArrayList<>();

            int a = sc.nextInt();
            int b = sc.nextInt();
            A.add(a);
            A.add(b);
            List<Integer> B = new ArrayList<>();

            int c = sc.nextInt();
            int d = sc.nextInt();
            B.add(c);
            B.add(d);

            List<Integer> F = new ArrayList<>();

            int e = sc.nextInt();
            int f = sc.nextInt();
            F.add(e);
            F.add(f);
            int distance;
            if((A.get(0).equals(F.get(0)) && B.get(0).equals(F.get(0))) || (A.get(1).equals(F.get(1)) && B.get(1).equals(F.get(1)))) {
                if((A.get(0)<F.get(0) && B.get(0)> F.get(0)) || (A.get(1)>F.get(1) && B.get(1)< F.get(1)) || (A.get(1)<F.get(1) && B.get(1)> F.get(1)) || A.get(0)>F.get(0) && B.get(0)< F.get(0)) {
                    distance = Math.abs((A.get(0) - B.get(0))) + Math.abs((A.get(1) - B.get(1)))+2;
                }
                else{
                    distance = Math.abs((A.get(0) - B.get(0))) + Math.abs((A.get(1) - B.get(1)));
                }
            }
            else{
                distance = Math.abs((A.get(0) - B.get(0))) + Math.abs((A.get(1) - B.get(1)));
            }
            System.out.println(distance);
        }
    }

}
