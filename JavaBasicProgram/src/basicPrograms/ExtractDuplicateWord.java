package basicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;







import com.google.common.collect.Multiset.Entry;

public class ExtractDuplicateWord {

	
	public static void main(String[] args) {
		
		
		String s[]={"ajay","kumar","biswal","kumar","java","python","java"};
		//1st approach
		 for(int i=0;i<s.length;i++){
			 
			 for(int j=i+1;j<s.length;j++){
				 
				 if(s[i].equals(s[j])){
					 
					 System.out.println("Duplicate words are :"+ s[i]);
				 }
			 }
		 }
		
		 ////2nd approach
		 Set<String> store=new HashSet<String>();
		  for(String name:s){
			  
			  if(store.add(name)==false){
				  System.out.println("Duplicate words are :"+ name);
			  }
			  
		  }
		
		  //3rd Approach
		  Map<String,Integer> hm=new HashMap<String,Integer>();
		  for(String names:s){
			  
			 if(hm.get(names) != null){
				 hm.put(names, hm.get(names)+1);
			 }
			 else{
				 hm.put(names,1);
			 }
		  
			 
//			 Set<Entry<String,Integer>> entrySet=storemap.entrySet();
//				for(Entry<String,Integer> entry:entrySet){
//					
//					if(entry.getValue()>1){
//						
//						System.out.println(entry.getKey());
//					}
//				}
			  
			  
	    } 
		 
	}
	
}