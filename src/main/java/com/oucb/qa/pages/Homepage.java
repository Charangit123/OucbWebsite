package com.oucb.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.oucb.qa.base.Testbase;

public class Homepage extends Testbase {

	// Page Factory or Object Repository
	@FindBy(xpath = "//h1[contains(text(),'Welcome to Osmania University,  Department of Business Management')]")
	WebElement homepage;

	@FindBy(xpath = "//li[contains(text(),'TATA BSS...')]/a[contains(text(),'Read more')]")
	WebElement listofcomapnies;

	@FindBy(xpath = "//p/img[@title='Osmania University - Department of Business Management']")
	WebElement logo;

	@FindBy(id = "eMail")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "imageField")
	WebElement signin;

	// initiallising the page objects
	public Homepage() {
		PageFactory.initElements(driver,this);
	}

	// actions
	public String validatinghomepageTitle() {
		return driver.getTitle();
	}

	public boolean VerifyLogo() {
		return logo.isDisplayed();
	}
	
	public void clickable() {
		listofcomapnies.click();
	}

	public Department login(String Username, String Password) { //Department
		username.sendKeys(Username);
		password.sendKeys(Password);
		signin.click();

		return new Department();
	}

}
