package A2OJ.Division_A;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int num=  n;
        DivisionNyLucky(num);
    }



    private static void DivisionNyLucky(int num) {
        int flag =0;
        if(LuckyNumbr(num)){
            System.out.println("YES");
            flag = 1;
            return;
        }

        for(int i =1;i<num;i++){
            if(LuckyNumbr(i) && num%i == 0){
                System.out.println("YES");
                flag  = 1;
                return;
            }
        }
        if(flag == 0){
            System.out.println("NO");
            return;
        }
    }

    private static boolean LuckyNumbr(int i) {
        boolean flag = true;
        while(i!=0){
            int rem= i%10;
            if(rem == 4 || rem == 7){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
            i/=10;
        }
        return flag;
    }
}
