package Division_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Maximums {
    public static void main(String[] args) throws IOException {
        BufferedReader sc =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int[] arr = new int[n];
        int[] res = new int[n];
        int ans = 0;
        StringTokenizer st = new StringTokenizer(sc.readLine());
        for(int i = 0;i<n;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken()); ;
            res[i] = ans+arr[i];
            ans = Math.max(ans, res[i]);
            System.out.print(res[i]+" ");
        }
    }
}
