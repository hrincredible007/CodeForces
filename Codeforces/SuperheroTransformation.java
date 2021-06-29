package Divivsion_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperheroTransformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        String t = br.readLine().toLowerCase();
        String vowel = "aeiou";
        int vow = 0, vowS=  0, vowt = 0;
        if(s.length()!=t.length()){
            System.out.println("No");
            System.exit(0);
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean res = vowel.indexOf(s.charAt(i)) != -1;
            boolean second = vowel.indexOf(t.charAt(i)) != -1;
            if(res && second){
                vow++;
            }if(res){
                vowS++;
            }
            if(second){
                vowt++;
            }

        }
        if(vow==vowS && vow==vowt){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
