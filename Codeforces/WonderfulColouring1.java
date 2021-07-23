package Division_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WonderfulColouring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
            //System.out.println(map.size());
            int count = 0;
            int countTwo = 0;
            int countMoreThanTwo = 0;
            for (Map.Entry<Character, Integer> e: map.entrySet()) {
                if(e.getValue()==1){
                    count++;
                }
                else if(e.getValue()==2){
                    countTwo++;
                }
                else{
                    countMoreThanTwo++;
                }
            }
            System.out.println(count+" \t"+ countTwo+" \t"+countMoreThanTwo);
            int res = count+ countTwo;
            int answer = 0;
            if(count!=0){
                answer += count/2;

                if(countMoreThanTwo>=1){
                    answer+=countMoreThanTwo;
                }
                System.out.println(answer+ countTwo);
            }
            else{
                if(countTwo != 0){
                    answer+= countTwo;
                }
                System.out.println(answer+countMoreThanTwo);
            }
        }
    }
}