package JAN21C;

import java.util.*;
import java.lang.*;
import java.io.*;

class Billrd
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
      int T=sc.nextInt();
      while(T>0){
          int N = sc.nextInt();
          int K = sc.nextInt();
          int x = sc.nextInt();
          int y = sc.nextInt();
          if(K%4==0) K=4;
          else K%=4;
          int a=0,b=0;
          
          int[][] A = new int[4][4];
          int diff = x-y;
          if(x>y){
              A[0][0] = N;
              A[0][1] = N-diff;
              A[1][0] = N-diff;
              A[1][1] = N;
              A[2][0] = 0;
              A[2][1] = diff;
              A[3][0] = diff;
              A[3][1] = 0;
              a=A[K-1][0];
              b=A[K-1][1];
          }else if(x<y){
              diff = -diff;
              A[0][0] = N-diff;
              A[0][1] = N;
              A[1][0] = N;
              A[1][1] = N-diff;
              A[2][0] = diff;
              A[2][1] = 0;
              A[3][0] = 0;
              A[3][1] = diff;
              a=A[K-1][0];
              b=A[K-1][1];
          }else if(x==y){
              a=N;
              b=N;
          }
          
          System.out.println(a+" "+b);
          T--;
      }
	}
}

//BILLRD - Point Of Impact