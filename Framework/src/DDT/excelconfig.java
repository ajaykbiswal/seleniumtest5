package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelconfig {
	
	XSSFWorkbook wb;
	XSSFSheet osheet;
	public excelconfig(String filepath){
		
		try {
			File src=new File(filepath);
			FileInputStream ofile=new FileInputStream(src);
			wb=new XSSFWorkbook(ofile);
		
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	
	public String getData(int sheetindex,int row,int col){
		
		osheet=wb.getSheetAt(sheetindex);
		return osheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	public int getrow(int sheetindex){
		
		int row=wb.getSheetAt(sheetindex).getLastRowNum()+1;
		return row++;
	}
	
}
