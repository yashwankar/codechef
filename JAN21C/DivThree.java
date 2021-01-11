package JAN21C;
import java.util.Scanner;
class DivThree
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
      int T=sc.nextInt();
      while(T>0){
          int N = sc.nextInt();
          int K = sc.nextInt();
          int D = sc.nextInt();
          int total = 0;
          int[] A = new int[N];
          for(int i=0; i<N; i++){
              A[i]=sc.nextInt();
              total += A[i];
          }
          int day = total/K;
          if(day>=D)
            System.out.println(D);
          else if(day<D)
            System.out.println(day);
          T--;
      }
    }
}

//DIVTHREE - Chef and Division 3