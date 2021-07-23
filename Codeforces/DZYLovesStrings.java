package Division_B;

import java.util.*;

public class DZYLovesStrings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str=  sc.next();
        int k = sc.nextInt();
        int[] alphabetsScore = new int[26];
        char ch = 'a';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabetsScore[i] = sc.nextInt();
            map.put(ch,alphabetsScore[i]);
            ch++;
        }
        //jSystem.out.println(map);
        Arrays.sort(alphabetsScore);
        List<Map.Entry<Character, Integer>> list =new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int c = str.length();
        int total = 0;
        for (int i = 1; i <= c; i++) {
            total += (i*map.get(str.charAt(i-1)));

        }
        //System.out.println(total);
        int p = 25;
        for (int i = c+1; i <= c+k; i++) {
            total += (i*list.get(p).getValue());
        }
        System.out.println(total);

    }
}





