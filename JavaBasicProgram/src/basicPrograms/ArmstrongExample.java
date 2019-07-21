package basicPrograms;

public class ArmstrongExample {

	public static void main(String[] args) {
		
		int n=153;
		int c = 0,a;
		int temp=n;
		while(n>0){
			
			a=n%10;//'3',2,1
			n=n/10;//15,1
			c=c+(a*a*a);//27,
			
		}

		
		if(c==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong Number");
			
	}

}
