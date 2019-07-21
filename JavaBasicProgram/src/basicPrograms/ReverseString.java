package basicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="madad";
		String rev="";
		int strlen=str.length();
		for(int i=strlen-1;i>=0;i--){
			
			rev=rev+str.charAt(i);
		}
		
        System.out.println(rev);
		
		StringBuffer s=new StringBuffer(str);
		System.out.println(s.reverse());
		
		
	}

	
	
	}
	
	

