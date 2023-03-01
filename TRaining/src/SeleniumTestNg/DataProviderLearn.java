package SeleniumTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearn {
	@Test(dataProvider = "Data")
	public void login(Object a, Object b) {
		System.out.println(a + " " + b );
	}

	@DataProvider(name = "Data")
	public Object[][] testData() {
		Object d[][] = new Object[2][2];
		d[0][0] = "3";
		d[0][1] = "13";
		
		d[1][0] = "23";
		d[1][1] = "30";
		return d;
	}
}


