package basicPrograms;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5*5+4*4-3*3+2*2-1*1
		int sum=0;
		
		  for(int i=5;i>=0;i--){
			  
			  if(i%2!=0){
				  if(sum<(i*i)){
					  sum=(i*i)-sum;
				  }
				  else{
					  sum=sum-(i*i);
				  }
			  }
			  else{
				  sum=sum+(i*i);
			  }
		  }
		
		 System.out.println(sum);
		
		

	}

}
