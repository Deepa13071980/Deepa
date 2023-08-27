package ExcelRead1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class E1 {
	@Test
	public void readexcel() throws IOException
	{
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\OrangeHRM_TestCases_V2.0.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x=new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		// number of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		// number of columns: about the row index : 2
		
		int col=sheet.getRow(2).getLastCellNum();
		System.out.println("Numbr of columns "+ col);
		
		//reading a cell value:  know the row index, column index 
		//5,2
		
		XSSFCell v = sheet.getRow(5).getCell(2);
		System.out.println(v);
		
		sheet.getRow(11).createCell(0).setCellValue("DEEPA");
		FileOutputStream fos=new FileOutputStream(f);
		x.write(fos);
	}
	
	
	

}
