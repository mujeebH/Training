package SeleniumTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import genericLib.ToRead2D;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDREaderDP {

	@Test(dataProvider = "Data")
	public void login(Object a, Object b) {
		System.out.println(a + " " + b);
	}

	@DataProvider(name = "Data")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		return ToRead2D.testData("Sheet1");
	}

}
