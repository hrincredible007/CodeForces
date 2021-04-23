package A2OJ.Division_A;

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        n = sc.nextInt();
        t = sc.nextInt();


        String str = sc.next();

        char[] arr =new char[str.length()];
        arr = str.toCharArray();




        for(int i =0; i < n-1; i++){
            if(t-- >0) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j + 1] < arr[j]) {  // B G G B G
                        // G B G G B
                        char ch = arr[i];
                        arr[i] = arr[j];
                        arr[j] = ch;

                    }
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ,");
        }
    }
}