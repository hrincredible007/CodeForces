package Divivsion_A;

import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, n;
        s = sc.nextInt();
        n = sc.nextInt();
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a, map.getOrDefault(a,0)+b);
        }
        int flag = 0;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        //System.out.println(list);
        for (Map.Entry<Integer, Integer> e: list) {
            if(s>e.getKey()){
                s+=e.getValue();

            }
            else{
                flag =1 ;
                System.out.println("NO");
                break;

            }
        }
        if(flag==0){
            System.out.println("YES");
        }
    }
}
