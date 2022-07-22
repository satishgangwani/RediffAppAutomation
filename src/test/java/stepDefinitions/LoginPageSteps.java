package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import browserFactory.AllBrowsers;
import io.cucumber.java.en.*;
import objectRepositories.RediffLoginPageOR;

public class LoginPageSteps {

	
	String title;
	AllBrowsers browserobj = new AllBrowsers();	
	WebDriver driver = browserobj.initBrowser("Chrome");
	RediffLoginPageOR loginPageobj = new RediffLoginPageOR(driver);
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPageobj.getLoginPageTitle();
		System.out.println("Page title is: " + title);
		
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPageobj.isForgotPwdLinkExist());
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String uname) {
		loginPageobj.enterUserName(uname);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
		loginPageobj.enterPassword(pwd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPageobj.clickOnLogin();
	}

	@Then("user gets the logout link on the page")
	public void user_gets_the_logout_link_on_the_page() {
		Assert.assertTrue(loginPageobj.isLogoutLinkExist());
	}

	@Then("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		loginPageobj.clickLogoutLink();
		//Thread.sleep(300);
	}

}





