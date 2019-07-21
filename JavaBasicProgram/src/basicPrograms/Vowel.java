package basicPrograms;

public class Vowel {

	public static void main(String[] args) {
		
		String str="This website is aw3som3.";
		str=str.toLowerCase();
		int vowel=0;
		int cons=0;
		int space=0;
		int digit=0;
		
		for(int i=0;i<str.length();i++){
			
			char line=str.charAt(i);
			
			if(line=='a'|| line=='e'||line=='i' || line=='o'|| line=='u'){
				
				vowel++;
				
			}
			else if(line>='a'&& line<='z'){
				cons++;
			}
			
			
			else if(line==' '){
				space++;
			}
			
			else if(line>='0'&& line<='9'){
				digit++;
			}
		}
		

		System.out.println(vowel);
		System.out.println(cons);
		System.out.println(space);
		System.out.println(digit);
		
		
	}

}
