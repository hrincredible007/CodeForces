import java.math.BigInteger;
import java.util.Scanner;

class TheatreSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m, a;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        BigInteger bg = new BigInteger(String.valueOf(n));
        BigInteger bg1 = new BigInteger(String.valueOf(m));
        BigInteger length = new BigInteger(String.valueOf(0));
        BigInteger breadth = new BigInteger(String.valueOf(0));
        if(n==1 && m==1){
            System.out.println(1);
            System.exit(0);
        }
        if(a==1){
            BigInteger as = bg.multiply(bg1);
            System.out.println(as);
            System.exit(0);
        }
        while(n>0){
            n-=a;
            length = length.add(BigInteger.valueOf(1));
        }
        while(m>0){
            m-=a;
            breadth = breadth.add(BigInteger.valueOf(1));
        }
        BigInteger res = length.multiply(breadth);
        System.out.println(res);
    }

}
