package SeleniumTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@AfterSuite
	public void AS() {
		System.out.println("AfterSuite");
	}
	@BeforeClass
	public void BC() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("BeforeMethod");
	}
	@BeforeSuite
	public void BS() {
		System.out.println("BeforeSuite");
	}
	@AfterClass
	public void AC() {
		System.out.println("AfterClass");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void AT() {
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void AM() {
		System.out.println("AfterMethod");
	}
	@Test
	public void a() {
		System.out.println("aTest");
	}
	@Test
	public void b() {
		System.out.println("bTest");
	}
}
