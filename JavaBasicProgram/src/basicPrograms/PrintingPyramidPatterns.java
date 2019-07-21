package basicPrograms;

public class PrintingPyramidPatterns {

	public static void main(String[] args) {
		
		//Simple pyramid pattern
		int n=5;
		
//		for(int i=0;i<=n;i++){
//			
//			for(int j=0;j<=i;j++){
//				
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}

		//After 180 degree rotation
		
		
		for(int i=0;i<=n;i++){
			
			
			 for(int j=2*(n-i);j>=0;j--){
				 
				 System.out.print(" ");
			 }
				for(int j=0;j<=i;j++){
					
					System.out.print("* ");
				}
				
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Printing Triangle
		
		
		for(int i=0;i<=n;i++){
			
			
		 for(int j=n-i;j>=0;j--){
			 
			 System.out.print(" ");
		 }
			for(int j=0;j<=i;j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
