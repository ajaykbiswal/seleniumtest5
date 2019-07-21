package basicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="The sky is blue selenium";
		String str1="The sky is blue selenium";
		String str2="The Sky is blue selenium";
		System.out.println(str.charAt(5));//k
		System.out.println(str.indexOf("e"));//2 //1st occurance
		System.out.println(str.indexOf("e", str.indexOf("e")+1));//2nd occurance
		//nth occurance
	    int pos=str.indexOf("e");
		int n=4;
		while(--n>0 && pos!=-1){
			
			pos=str.indexOf("e", pos+1);
		}
			
		System.out.println(pos);
		
		System.out.println(str.indexOf("sky"));//4
		
		System.out.println(str.indexOf("hello"));//-1 It is used to check text existancy if str>-1
		
		System.out.println(str.equals(str1));//TRUE
		System.out.println(str.equals(str2));//FALSE
		
		System.out.println(str.equalsIgnoreCase(str1));//TRUE
		
		System.out.println(str.subSequence(0, 9));// the sky i
		
		//trim
		//replace
		
		//split
		
		String s1="cars1";
		System.out.println(s1.concat("t"));//cars1t
		
		//important questions
		
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+(a+b));//HelloWorld300

	}

}
