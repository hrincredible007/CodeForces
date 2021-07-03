package Division_B;
import java.util.Scanner;

public class YetAnotherBookshelf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            StringBuilder wd = new StringBuilder();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                wd.append(arr[i]);
            }
            int res = 0;
            wd = new StringBuilder(wd.substring(wd.toString().indexOf('1'), wd.toString().lastIndexOf('1') + 1));
            for (int i = 0; i < wd.length(); i++) {
                char ch = wd.charAt(i);
                if(ch=='0'){
                    res = res+1;
                }
            }
            System.out.println(res);
        }

    }
}
