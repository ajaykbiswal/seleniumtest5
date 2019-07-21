package basicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordDuplicate {

	public static void main(String[] args) {
		
		String str="i am am good good boy boy some owrd some";
		
		String s[]=str.split(" ");
		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(String name:s){
			
			if(hm.get(name) != null){
				
				hm.put(name, hm.get(name)+1);
				
			}
			else
			{
				hm.put(name, 1);
			}
		}
		
		System.out.println(hm);
		
	}

}
