package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	// 1. By locators
	private By emailID = By.id("email");
	private By pwd = By.id("passwd");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	private By signInBtn = By.id("SubmitLogin");

	// 2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page Actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public Boolean visibilityOfFPLink() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUName(String Uname) {
		driver.findElement(emailID).sendKeys(Uname);
	}

	public void enterPwd(String passwd) {
		driver.findElement(pwd).sendKeys(passwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInBtn).click();
	}

}
