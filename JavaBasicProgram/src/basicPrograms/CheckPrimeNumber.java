package basicPrograms;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		boolean isprime=true;
		int num=19;
		System.out.println(num/2);
		for(int i=2;i<num/2;i++)
		{
			
			int temp=num%i;
			
			if(temp==0){
				
				isprime=false;
				break;
			}
			
		}

		
		if(isprime)
			 System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
			
		
	}

}
