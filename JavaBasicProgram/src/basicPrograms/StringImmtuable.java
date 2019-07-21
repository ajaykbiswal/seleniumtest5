package basicPrograms;

public class StringImmtuable {
	
	public static void main(String[] args) {
		
		
		String s1="Kumar";
		String s2="kumar";
		String s3="kumar";
		
		System.out.println(s3.concat("ajay"));//1st concept
		
		
	
		String s4=new String("kumar").intern();
		
		System.out.println(s1.hashCode());//3rd
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());
		
		
		
		
		
	
		
	}		

	

}
