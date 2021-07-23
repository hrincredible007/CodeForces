package Contests.EducationalCodeforcesRound111;

import java.util.Scanner;

public class MaximumCostDeletion {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n, a, b;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            String str = sc.next();
            int result = a*n;
            if(b==0){
                System.out.println(result);
            }
            else if (b>0){
                System.out.println(result+b*n);
            }
            else{
                int count = 1;
                for (int i = 0; i < n-1; i++) {
                    if(str.charAt(i)!=str.charAt(i+1)){
                        count++;
                    }
                }
                count = count/2;
                System.out.println((count+1)*b+result);
            }
        }
    }
}
