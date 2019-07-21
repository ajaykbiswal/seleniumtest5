package basicPrograms;

public class checkPrime {

	public static void main(String[] args) {
		boolean isPrime=true;
		int n=10;
		for(int i=2;i<n/2;i++)
		{  
			if(n%i==0)
			{
				isPrime=false;
				
			}
			
		}
		
		   if(isPrime){
			
			System.out.println(n + " is a Prime Number");
		   }
			else{
				System.out.println(n + " is not a Prime Number");	
		}
	}

}
