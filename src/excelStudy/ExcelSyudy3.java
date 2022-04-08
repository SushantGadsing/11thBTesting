package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSyudy3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream excelfile =new FileInputStream("D:\\excelbook\\practice.xlsx");
	Sheet myfile = WorkbookFactory.create(excelfile).getSheet("Sheet1");
	
	for (int i=0; i<=1;i++) 
	{
		for(int j=0; j<=2; j++) 
		
		{
			String value = myfile.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value +"  ");
			
		}
		
		System.out.println();
	}
	
	
	}
	

}
