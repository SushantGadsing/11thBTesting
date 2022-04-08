package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream Myfile = new FileInputStream("D:\\excelbook\\my data.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");

		
		int lastRowNum = Mysheet.getLastRowNum();
		System.out.println("this is Last row no "+lastRowNum);
	    int TotalRowNo = lastRowNum;
	
	short LastCellNo = Mysheet.getRow(0).getLastCellNum();
	System.out.println("this is Last row no  "+LastCellNo);
	int ToatlCellNo = LastCellNo-1;
	
	for(int i=0;i<=TotalRowNo;i++) 
	{
		for(int j=0; j<=ToatlCellNo; j++) 
		 
		{String value = Mysheet.getRow(i).getCell(j).getStringCellValue();
			
		System.out.print(value + "    ");	
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	}

}
