package cts.orangehrm.utility;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * class reads the data from excel sheet
 * @author supriya
 * @author manasa
 * @author afreen
 *
 */
public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	/**
	 * This method is to set the File path and to open the Excel file,Pass Excel Path as Arguments to this method
	 * @param excelpath
	 */

	public ExcelDataConfig(String excelpath) {

		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);	
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
	}
	/**
	 * This method is to read the test data from the Excel cell, in this we are passing parameters as sheetNumber,Row and Column 
	 * @param sheetNumber
	 * @param row
	 * @param column
	 * @return
	 */
	public String getData(int sheetNumber,int row,int column) {
		sheet1=wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	/**
	 * This method is to read the test data from the Excel cell, in this we are passing parameters as sheetIndex
	 * @param sheetIndex
	 * @return
	 */
	public int getRowCount(int sheetIndex) {
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
	/**
	 * This method is to pass data 
	 * @return data
	 */
	public Object[][] passData() {


		int noofrows=getRowCount(0);
		Object[][] data=new Object[noofrows][2];

		for(int i=0;i<noofrows; i++) {
			data[i][0]=getData(0, i, 0);
			data[i][1]=getData(0, i, 1);
		}

		return data;
	}

}
