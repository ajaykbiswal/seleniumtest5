package basicPrograms;

public class Missingnumber {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9};
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++){
			
			sum=sum+a[i];
		}
	   System.out.println(sum);
	   for(int j=1;j<=10;j++){  // for last bound+1 if last is 10 then j<=11
		   
		   sum1=sum1+j;
	   }
	   
	   System.out.println(sum1);
	   System.out.println(sum1-sum);
	
	}
	 

}
