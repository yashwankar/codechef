package JAN21C;

import java.util.*;
import java.lang.*;
import java.io.*;

class FairElct
{
	public static void main (String[] args)  throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(T>0){
              int N = sc.nextInt();
              int M = sc.nextInt();
              int minOfnm = (N<=M) ? N : M;
              ArrayList<Integer> A = new ArrayList<Integer>();
              ArrayList<Integer> B = new ArrayList<Integer>();
              int totalA=0, totalB=0;
              for(int i=0; i<N; i++){
                  int val = sc.nextInt();
                  sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                  A.add(val);
                  totalA+=val;
              }
              for(int i=0; i<M; i++){
                  int val = sc.nextInt();
                  sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                  B.add(val);
                  totalB+=val;
              }
              Collections.sort(A);
              Collections.sort(B, Collections.reverseOrder());
              
              int count = 0;
              while(count < minOfnm){
                  if(totalA > totalB){
                      break;
                  }
                  else{
                      int temp = A.get(count);
                      A.set(count, B.get(count));
                      B.set(count, temp);
                  }
                  totalA=0;
                  totalB=0;
                  for(int i:A) totalA+=i;
                  for(int i:B) totalB+=i;
                  count++;
              }
              if(totalA>totalB)
                System.out.println(count);
              else
                System.out.println(-1);
              
              T--;
      }
	}
}

//FAIRELCT - Fair Elections