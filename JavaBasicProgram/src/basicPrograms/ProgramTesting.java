package basicPrograms;


public class ProgramTesting {

	public static void main(String[] args) {
		
   
		String str="dhjjsjdsdksksdsd";
	    int count=0;
	
//		for(int i=0;i<str.length();i++){
//			
//			
//			for(int j=0;j<str.length();j++){
//				System.out.println("The value of i is:" + str.charAt(i));
//				System.out.println("The value of j is:"+ str.charAt(j));
//				if(str.charAt(i)==str.charAt(j)){
//					
//					count++;
//				}
//			}
//			
//			System.out.println(str.charAt(i)+"--"+ count);
//			String d=String.valueOf(str.charAt(i)).trim();
//			str=str.replaceAll(d, "");
//			count=0;
//			
//		}
//		
//	
		char[] imp=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			
			for(int j=0;j<str.length();j++)
			{
				
				if(imp[i]==imp[j])
				{
					
					count++;
				}
			}
			System.out.println(imp[i]+" "+ count);
			String d=String.valueOf(imp[i]).trim();
			str=str.replaceAll(d, "");
			count=0;
			
			
		}
		
		
	}
	
}

