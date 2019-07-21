package basicPrograms;

public class ThirdLargest {

	public static void main(String[] args) {
		
		String str="sjjkksdkmmlssdsdk";
		int count=0;
		char[] imp=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			
			for(int j=0;j<str.length();j++)
			{
				
				if(imp[i]==imp[j])
				{
					
					count++;
				}
			}
			
			System.out.println(imp[i] + "--" + count);
			
			String d=String.valueOf(imp[i]).trim();
			
			System.out.println(d);
			str=str.replaceAll(d, "");
			System.out.println(str);
			count=0;
			
			
			
		}
		
		

	}

}
