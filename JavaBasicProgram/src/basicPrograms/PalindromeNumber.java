package basicPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n=454,sum=0,temp=n,r;
		
		while(n>0)
		{
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
	
		}
		
		if(sum==temp)
			
			System.out.println("palindrome number "); 
		
		else
			System.out.println("Not a palindrome number "); 
		
//		String str="madam";
//		int len=str.length();
//		String rev="";
//		
//		for(int i=len-1;i>=0;i--){
//			
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
//		if(str.equals(rev))
//		 System.out.println(str + " is a palindrome");
//		else
//			System.out.println(str + " is not a palindrome");
//		
//		
		System.out.println(new StringBuffer(String.valueOf(n)).reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
	}

}
