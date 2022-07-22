package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageOR {

	public WebDriver driver;
	
	public RediffLoginPageOR(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Forgot Password?")
	@CacheLookup
	WebElement forgotPwdLink;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement logoutLink;
	
	@FindBy(xpath = "//input[@id = 'login1']")
	@CacheLookup
	WebElement username;
	
	@FindBy(css = "input#password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name = "proceed")
	@CacheLookup
	WebElement signInButton;
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return forgotPwdLink.isDisplayed();
	}
	
	public boolean isLogoutLinkExist() {
		return logoutLink.isDisplayed();
	}
	
	public void clickLogoutLink() {
		logoutLink.click();
	}
	
	public void enterUserName(String uname) {
		username.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickOnLogin() {
		signInButton.click();
	}
}
