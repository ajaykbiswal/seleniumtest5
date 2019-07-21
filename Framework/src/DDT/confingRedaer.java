package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class confingRedaer {
	
	Properties pro;
	public confingRedaer(){
		
		try {
			File src=new File("./configuration/config.property");
			FileInputStream ofile=new FileInputStream(src);
			pro=new Properties();
			pro.load(ofile);
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public String getChromeDriver(){
		return pro.getProperty("ChromeDriver");
		
		
	}
	
	public String getApplicationURL(){
		return pro.getProperty("URL");
		
		
	}
	
	public String getExcelPath(){
		return pro.getProperty("ExcelPath");
		
		
	}

}
