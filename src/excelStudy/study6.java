package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class study6 {

	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    	
	  	FileInputStream Myfile= new FileInputStream("D:\\excelbook\\myexcel.xlsx");
	  	
        Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		int TotalRowNum = Mysheet.getLastRowNum();
		int TotalColumnNum = Mysheet.getRow(0).getLastCellNum()-1;
	
		for(int i=0; i<=TotalRowNum;i++) 
		{
			
			for(int j = 0;j<=TotalColumnNum;j++)
			{
				
			Cell info = Mysheet.getRow(i).getCell(j);
			CellType type = info.getCellType();//it shows type of data type
			
			if(type==CellType.STRING) 
			{
				String value = info.getStringCellValue();
				System.out.println(value  +"  ");
				
				
			
			}	
	
			}
			
			
			
			
		}
		
		
		
	}

}
