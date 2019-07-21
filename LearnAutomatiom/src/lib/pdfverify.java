package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;


public class pdfverify {
	static File file;
	public static String pdfverifys() {
	        
		  
		
			file=new File("C:\\Users\\ajayb4\\Downloads\\PDF\\Form-16.pdf");
			
			String data="";
			try {
				FileInputStream ofile=new FileInputStream(file);
				
				PDFParser parser=new PDFParser(ofile);
				parser.parse();
				COSDocument cos=parser.getDocument();
				PDDocument pddoc=new  PDDocument(cos);
				PDFTextStripper  strip=new PDFTextStripper();
				data = strip.getText(pddoc);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
			
	
	
	}
	
	
	public static void deletedownloadfile(){
		
		try {
			file=new File("C:\\Users\\ajayb4\\Downloads\\PDF");
			File[] files=file.listFiles();
			for(File f:files){

					if(f.exists()){
							f.delete();
							System.out.println(f.getName()+ " is deleted!");	
					}else{
						System.out.println("Delete operation is failed.");
					}
			}	
				   } catch (Exception e) {
					
					e.printStackTrace();
				}
				   
		}
		
	

}











 

 


 


 

	
 


 
