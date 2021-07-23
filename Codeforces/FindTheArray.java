package Contests.EducationalCodeforcesRound111;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            if(a==1){
                System.out.println(1);
                continue;
            }
            
            int s = 0;
            int count = 0;
            for (int i = 1; i < a+100; i+=2) {
                s+= i;
                count++;
                if(s==a){
                    System.out.println(count);
                    break;
                }
                else if(s>a){
                    System.out.println(count);
                    break;
                }

            }

        }
    }
}
