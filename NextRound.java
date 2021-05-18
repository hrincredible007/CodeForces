import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]!=0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(0);
            System.exit(0);
        }
        int pos = arr[k-1];
        int i = 0;
        while(i!=n && arr[i]>=pos){
            if(arr[i]!=0) {
                count++;
            }
            i++;
        }
        System.out.println(count);

    }
}
