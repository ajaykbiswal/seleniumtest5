package basicPrograms;

public class Inheritance {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.Start();
	    b.BMWStop();
		b.CarSaftey();
		b.Stop();
		b.Refule();
		
		Car c=new Car();
		c.Start();
		c.Stop();
		c.Refule();
		
		Car a=new BMW();
		a.Start();
		a.Stop();
		a.Refule();
		

	}

}
