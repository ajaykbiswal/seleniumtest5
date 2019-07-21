package basicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.asserts.SoftAssert;

public class practice {

	public static void main(String[] args) {
		
//		
	int a[]={12,43,976,-54,2};
	List<Integer> list=new ArrayList<Integer>();
	for(Integer i:a){
		
		list.add(i);
	}
	
	System.out.println(Collections.max(list));
//		list.add(12);
//		list.add(43);
//		list.add(976);
		
		
		SoftAssert soft=new SoftAssert();
		soft.assertAll();
		
		
		
		
	}

	 

	
}
