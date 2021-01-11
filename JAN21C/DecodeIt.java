package JAN21C;

import java.util.Scanner;
class DecodeIt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
      Scanner sc = new Scanner(System.in);
      char[][][][] A = {
                    {
                      {{'a','b'},{'c','d'}},
                      {{'e','f'},{'g','h'}}
                    },
                    {
                      {{'i','j'},{'k','l'}},
                      {{'m','n'},{'o','p'}}
                    },
                  };
      int T=sc.nextInt();
      sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      while(T>0){
          int N=sc.nextInt();
          sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          String S = sc.nextLine(); 
          sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          for(int i=0; i<N; i+=4){
              int a = Character.getNumericValue(S.charAt(i)); 
              int b = Character.getNumericValue(S.charAt(i+1)); 
              int c = Character.getNumericValue(S.charAt(i+2)); 
              int d = Character.getNumericValue(S.charAt(i+3)); 
              System.out.print(A[a][b][c][d]);
          }
          System.out.println();
          T--;
      }
	}
}

//DECODEIT - Encoded String