package basicPrograms;

public class PrimeNunber {

	public static void main(String[] args) {
		
		String primenumbers="";
		
		for(int i=2;i<=50;i++){
			
			int counter=0;
			
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					
					counter=counter+1;
				}
				
		
			}
			
			
			if(counter==2)
			{
				
				primenumbers= primenumbers + i +" ";
			}
		}
		
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primenumbers);
		
	}	
}
