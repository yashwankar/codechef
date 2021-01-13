package Practice;

import java.util.Scanner;
import java.util.HashSet;

public class CSum {
    static String pair(int[] L, int K, int size){
        HashSet<Integer> mySet = new HashSet<>();
        for(int i=0; i<size; i++){
            int diff = K - L[i];
            if(mySet.contains(diff))
                return "Yes";
            mySet.add(L[i]);
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for(int i=0; i<N; i++){
                A[i] = sc.nextInt();
            }
            System.out.println(pair(A, K, N));
        }
        sc.close();
    }
}