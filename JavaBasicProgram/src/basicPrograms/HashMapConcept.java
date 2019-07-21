package basicPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(1, "Tom");
		h1.put(2, "Tom");
		h1.put(3,"Vijay"); 
        h1.put(4,"Ravi"); 
        h1.put(5,"Rahul");
        
       
        
        for(Map.Entry m:h1.entrySet()){
        	
        	System.out.println(m.getKey()+" "+m.getValue());
        }
		
		h1.remove(3);
		
		System.out.println(h1);
		
		HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
		Employee e1=new Employee("Tom",25,"Dev");
		Employee e2=new Employee("Peter",27,"QA");
		Employee e3=new Employee("Steve",30,"Admin");
		
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		//traverse the hashmap
		
		for(Entry<Integer,Employee> e:hm.entrySet()){
			
			int key=e.getKey();
			Employee m=e.getValue();
			System.out.println(key+" " +"Info");
			System.out.println(m.name+" "+m.age+" "+m.dept);
			
		}
		
		
		
		
		
		
		
		
	}

}
