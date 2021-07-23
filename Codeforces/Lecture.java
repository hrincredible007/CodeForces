package Division_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            String str2 = sc.next();
            hashMap.put(str, str2);
        }
        for (int i = 0; i < n; i++) {
            String wd = sc.next();
            if(hashMap.containsKey(wd)){
                if(wd.length()> hashMap.get(wd).length()){
                    System.out.print(hashMap.get(wd)+" ");
                }
                else{
                    System.out.print(wd+" ");
                }
            }
            else{
                System.out.print(wd+" ");
            }
        }
        System.out.println();

    }
}
