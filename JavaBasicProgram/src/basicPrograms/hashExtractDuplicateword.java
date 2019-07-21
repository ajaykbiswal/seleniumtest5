package basicPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashExtractDuplicateword {

	public static void main(String[] args) {
		
		String str[]={"ajay","kumar","biswal","kumar","java","python","java"};
		
		Map<String,Integer> storemap=new HashMap<String,Integer>();
		for(String name:str){
			
			if(storemap.containsKey(name)){
				
				storemap.put(name, storemap.get(name)+1);
			}
			else{
				storemap.put(name, 1);
			}
		}
		
		Set<Entry<String,Integer>> entrySet=storemap.entrySet();
		for(Entry<String,Integer> entry:entrySet){
			
			if(entry.getValue()>1){
				
				System.out.println(entry.getKey());
			}
		}
		

	}

}
