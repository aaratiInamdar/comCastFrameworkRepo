package com.Vtiger.Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook wb=null;
	
public String getExcelData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./testData2/TestScriptData.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    String data = wb.getSheet("Org").getRow(rowIndex).getCell(cellIndex).toString();

	return data;
}
	
public void dataBackToExcel(int rowIndex, int cellIndex) throws IOException
{
	FileInputStream fis=new FileInputStream("./testData2/TestScriptData.xlsx");
	Cell cell = wb.getSheet("Org").getRow(rowIndex).createCell(cellIndex);
	cell.setCellType(CellType.STRING);
	cell.setCellValue("pass");
	
	FileOutputStream fos=new FileOutputStream("./testData2/TestScriptData.xlsx");
	wb.write(fos);
	
}

public void closeWorkbook() throws IOException
{
	wb.close();	
}
	
}
