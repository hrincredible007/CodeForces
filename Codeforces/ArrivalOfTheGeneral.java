import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }
        Collections.sort(list,Collections.reverseOrder());
        int maximum = list.get(0);
        int minimum = list.get(n-1);
        int maxPos = 0;
        /*System.out.println(list);
        System.out.println(maximum+", "+minimum);
        */int minPos = 0;
        for (int i = 0; i <n; i++) {
            if (arr[i] == maximum) {
                maxPos = i;
                break;
            }
        }
        for (int i = 0; i <n; i++) {
            if(arr[i] == minimum){
                minPos = i;
            }
        }
        maxPos +=1;
        minPos +=1;
        if(maxPos>minPos) {
            System.out.println(n - minPos + maxPos - 2);
        }
        else{
            System.out.println(n - minPos + maxPos - 1);

        }
    }
}
