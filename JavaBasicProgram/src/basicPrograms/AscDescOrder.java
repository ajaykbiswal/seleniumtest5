package basicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class AscDescOrder {

	public static void main(String[] args) {
		String a[]={"a","c","v","b","z"};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
	    
		System.out.println(Arrays.toString(a));
		
		
		int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		   int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   for (int i = 0; i < array.length; i++) {
		     System.out.println(array[i]);
		   }
		  

	}

}
