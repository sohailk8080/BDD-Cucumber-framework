package stepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private LoginPage loginObj = new LoginPage(DriverFactory.getDriver());
	private static String title;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("User gets title of the page")
	public void user_gets_title_of_the_page() {
		title = loginObj.getLoginPageTitle();
		System.out.println("User is on login page::" + title);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		Assert.assertTrue(title.contains(expectedTitle));
	}


	@Then("Forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginObj.visibilityOfFPLink());
	}

	@When("user enters username {string}")
	public void user_enters_username(String Uname) {
		loginObj.enterUName(Uname);

	}

	@When("User enters password {string}")
	public void user_enters_password(String pwd) {
		loginObj.enterPwd(pwd);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginObj.clickOnLogin();

	}


}
