    package Divivsion_A;

    import java.util.Scanner;

    public class BadUglyNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                if(n==1){
                    System.out.println(-1);
                    continue;
                }
                String str = "2";
                for (int i = 0; i < n-1; i++) {
                    str = str+"3";
                }
                System.out.println(str);
            }
        }
    }
