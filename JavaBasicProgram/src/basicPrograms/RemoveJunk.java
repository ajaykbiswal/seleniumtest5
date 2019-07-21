package basicPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		
//		String str="@dg24bs!%$#22@@@@";
//		//String regexp=[a-zA-z]
//		String s=str.replaceAll("[^a-zA-z0-9]", "");
//		System.out.println(s);
		
		int n=153;
		int r;
		int s=0;
		while(n>0){
			
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
			
		}
		
			System.out.println(s);	
			
			long num=2432676;
			
			
			System.out.println(new StringBuffer(String.valueOf(num)).reverse());
			
			int a=7;
			int b=3;
			int c;
			c=a+b;
			a=c-a;
			b=c-b;
			System.out.println(a);
			System.out.println(b);
					
			
		
	}

}
