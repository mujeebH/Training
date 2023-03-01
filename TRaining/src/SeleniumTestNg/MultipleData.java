package SeleniumTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		int r=s.getPhysicalNumberOfRows();
		int c=s.getRow(0).getPhysicalNumberOfCells();
		Object o[][]=new Object[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				o[i][j]=s.getRow(i).getCell(j).toString();
				//System.out.print(s.getRow(i).getCell(j).toString()+" ");
			}
			//System.out.println();
		}
	}

}
