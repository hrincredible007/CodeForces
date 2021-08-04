package Division_B;

import java.util.*;

public class JohnnyAndHisHobbies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int flag = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int help = 0;
            for (int i = 0; i < 1024; i++) {
                Set<Integer> list = new HashSet<>();

                help = i+1;
                for (int j = 0; j < n; j++) {
                    int k = arr[j] ^ (i + 1);
                    list.add(k);
                }
                flag = 0;
                for (int j = 0; j < n; j++) {
                    if (!list.contains(arr[j])) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    break;
                }

            }
            if(flag==0){
                System.out.println(help);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
