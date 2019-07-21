package basicPrograms;

public class DynamicBinding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		b.deposite();
		b=new hdfc();
		b.deposite();
		b=new axis();
		b.deposite();
		
		

	}

}

