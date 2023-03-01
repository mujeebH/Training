package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToRead2D {
	public static  Object[][] testData(String Sheet) throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(Sheet);
		int r=s.getPhysicalNumberOfRows()-1;
		int c=s.getRow(0).getPhysicalNumberOfCells();
		Object o[][]=new Object[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				o[i][j]=s.getRow(i+1).getCell(j).toString();
			}
		}	
		return o;
	}
}
