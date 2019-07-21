package basicPrograms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Tom");
		h1.put(101,"Vijay"); 
        h1.put(102,"Ravi"); 
        h1.put(103,"Rahul");
		
		// create a clone/copy
        
        Hashtable h2=new Hashtable();
        
        h2=(Hashtable)h1.clone();
        
//        System.out.println(h1);
//        System.out.println(h2);
//        h1.clear();
//        System.out.println(h1);
//        System.out.println(h2);
        
        //contains
        System.out.println("::::::::::::::::::");
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(1,"ajay"); 
        ht.put(1,"rama"); 
        ht.put(104,"Vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(103,"Rahul"); 
        
        if(ht.contains("ajay")){
        	
        	System.out.println("values found");
        }

        //print all the values using Enumeration
        
        Enumeration ele=ht.elements();
        while(ele.hasMoreElements()){
        	System.out.println(ele.nextElement());
        }
        
        for(Map.Entry e:ht.entrySet()){
        	
        	System.out.println(e.getKey()+" "+ e.getValue());
        }
        
        //get all the values by using entryset
        
        Set s=ht.entrySet();
        System.out.println(s);
        
        // check both the hastable is equal or not
        
        Hashtable<Integer,String> ht1=new Hashtable<Integer,String>(); 
        ht1.put(101,"ajay"); 
        ht1.put(104,"Vijay"); 
        ht1.put(102,"Ravi"); 
        ht1.put(103,"Rahul");
        
        if(ht.equals(ht1)){
        	System.out.println("Both the hashtable is equal");
        }
        
        //Get the particular key value
        
       System.out.println(ht.get(101));
       
       //get the hascode
       
       System.out.println(ht1.hashCode());
       
	}

}
