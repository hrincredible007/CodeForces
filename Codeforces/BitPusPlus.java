import java.util.Scanner;

public class BitPusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n-->0){
            String str = sc.next();
            if(str.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
