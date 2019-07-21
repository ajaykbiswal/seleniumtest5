package basicPrograms;

public class Checkvowelandcon {

	public static void main(String[] args) {
		 char ch='i';
		 
		 if(ch=='i'||ch=='e'||ch=='i' || ch=='o'|| ch=='u'){
			 
		    System.out.println(ch + " is vowel");
		       
		 }
		 else{
			
		            System.out.println(ch + " is consonant");
		 }
		 
		 
		 char ch1='z';
		 
		 switch(ch1){
		 	case 'a':
		 	case 'e':
		 	case 'i':
		 	case 'o':
		 	case 'u':
		 			System.out.println(ch1+" is vowel");
		 			break;
		 	default:
		 		   System.out.println(ch1+" is consonant");
			 
		 
		 
		 }
		 
		 
		 
		 
		 
		 
	}

}
