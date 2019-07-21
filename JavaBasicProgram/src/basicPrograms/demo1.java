package basicPrograms;

public class demo1 {

	public static void main(String[] args) {
		
	 
		String str="Eroll leadership program leadershipe";
		int n=5;
		int f=str.indexOf("e");
		while(--n>0 && f!=-1){
			
			f=str.indexOf("e", f+1);
		}
		
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		  
	  	}
}
