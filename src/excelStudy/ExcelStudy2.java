package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream MyFile = new FileInputStream("D:\\excelbook\\my data.xlsx");
		
	  Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	for(int i = 0;i<=1;i++) 
	{
		for(int j=0; j<=4;i++) 
		{
			 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			 System.out.print(value +"  ");
		}
		System.out.println();
	}
	
	
//	 String value1 = mysheet.getRow(0).getCell(0).getStringCellValue();
//	
//	System.out.println(value1 );
	}

}
