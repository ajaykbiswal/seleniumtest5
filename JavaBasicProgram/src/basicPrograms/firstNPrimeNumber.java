package basicPrograms;

public class firstNPrimeNumber {

	public static void main(String[] args) {
		
	int n=15;

		int num=3;
		int status=1;
		System.out.println(Math.sqrt(num));
		System.out.println(2);
		
		for ( int i = 2 ; i <=n ; )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;

	      }

	}

}
