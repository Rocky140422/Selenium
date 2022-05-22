package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetSinlgeCellFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
        FileInputStream file = new FileInputStream("C:/Users/Admin/workspace/AutomationSeleniumProg/Excel Data/Sample1.xlsx");
		
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
		
	//	String value = excel.getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println(value);
	for(int row=0;row<2;row++)
	{
		for(int cell=0;cell<5;cell++)
		{
			System.out.print(excel.getRow(row).getCell(cell).getStringCellValue() +"\t");
		}
		System.out.println();
	}
	}

}
