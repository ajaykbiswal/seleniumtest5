package basicPrograms;

import java.util.HashMap;
import java.util.Map;



public class DuplicateOccuranceCount {

	public static void main(String[] args) {
		
		String str="WelcometoJavaSession"; 
		char st[]=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for(char value:st){
			
			if(Character.isAlphabetic(value)){
				
				if(mp.containsKey(value)){
				   
					mp.put(value, mp.get(value)+1);
				}
				else{
					mp.put(value, 1);
				}
					
			}
		}
		System.out.println(mp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
