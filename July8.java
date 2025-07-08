// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // Array Size
        int n = sc.nextInt();
        int[] A = new int[n+1];

        // Array Elements
        for (int i = 1 ; i <= n ; i++){
            A[i] = sc.nextInt();
        }
        
        // Query Size
        int q = sc.nextInt();
        
        long totalSum = 0;
        
        for (int j = 1 ; j <= q ; j++){
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            if (type == 1){
                for (int i = l ; i <= r ; i++){
                    A[i] = (int)(((long)(i-l+1)*A[i])%MOD);
                }
            }
            else{
                long sum = 0;
                for (int i = l ; i <= r ; i++){
                    sum = (sum + A[i]) % MOD;
                }
                totalSum = (totalSum + sum) % MOD;
            }
        }
        System.out.println(totalSum);
        sc.close();
    }
}