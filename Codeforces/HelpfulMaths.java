package A2OJ.Division_A;

import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i< str.length();i++){
            char ch = str.charAt(i);
            if(ch!='+'){
                list.add((Integer.parseInt(String.valueOf(ch))));
            }
        }
        Arrays.sort(list.toArray());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {

            if(i!=list.size()-1)
                System.out.print(list.get(i)+"+");
            else{
                System.out.print(list.get(i));
            }

        }
    }
}