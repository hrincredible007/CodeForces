package Divivsion_A;

import java.util.*;

public class Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] vec = new int[n][m];
        for (int i = 0; i<n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                vec[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        int isFlag = solve(vec, n, m);
        if(isFlag==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    private static int solve(int[][] arr, int n, int m) {
        int flag = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> setCol = new HashSet<>();
            for (int j = 0; j < m; j++) {
                setCol.add(arr[i][j]);
            }
            if (setCol.size() != 1) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            for (int i = 0; i < n; i++) {
                list.add(arr[i][0]);
            }
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i) == list.get(i+1)){
                    flag = 1;
                    break;
                }
            }
        }
        return flag;
    }
}