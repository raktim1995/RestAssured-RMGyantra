package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {

	
	public String readDataIntoExcel(String SheetName,int RowNo,int ColumnNo) throws Throwable, IOException {
		
		FileInputStream ft = new FileInputStream(IpatthConstant.excelPath);
		Workbook wt = WorkbookFactory.create(ft);
		Sheet st = wt.getSheet(SheetName);
		Row rw = st.getRow(RowNo);
		Cell cell = rw.getCell(ColumnNo);
		String value = cell.getStringCellValue();
		return value;

	}
		public void writeDataExcel(String SheetName,int RowNo,int ColumnNo,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream ft = new FileInputStream(IpatthConstant.excelPath);
			Workbook wt = WorkbookFactory.create(ft);
			Sheet st = wt.getSheet(SheetName);
			Row rw = st.getRow(RowNo);
			Cell cell = rw.getCell(ColumnNo);	
			cell.setCellValue(data);
			
			FileOutputStream fi = new FileOutputStream(IpatthConstant.excelPath);
			wt.write(fi);
			
		}
}
