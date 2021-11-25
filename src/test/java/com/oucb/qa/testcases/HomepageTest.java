package com.oucb.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import com.oucb.qa.base.Testbase;
import com.oucb.qa.pages.Department;
import com.oucb.qa.pages.Homepage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class HomepageTest extends Testbase {
	Homepage page;
	Department dept;

//	Department dept;
	public HomepageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		page = new Homepage();
		dept= new Department();
	}

	@Test(priority = 1)
	public void Homepagetitletest() throws Exception {
		String title = page.validatinghomepageTitle();
		Assert.assertEquals(title, "Welcome  fghhj Management");
		page.clickable();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void logotest() {
		boolean flag = page.VerifyLogo();
		Assert.assertTrue(true, "Logo not displayed");
	}

	@Test(priority = 3)
	public void logintest() {
		dept= page.login(prop.getProperty("usename"), prop.getProperty("pass"));
		
	}

	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}
