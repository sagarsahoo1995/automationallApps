package automationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationCommonPages.CommonPage;

public class AdminPage extends CommonPage {

	// Locater

	@FindBy(xpath = "//*[@name='username']")
	WebElement userNmae;
	@FindBy(xpath = "//*[@name='password']")
	WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login;

	// Page Factory

	public AdminPage() {

		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException {
		userNmae.sendKeys("Admin");
		Thread.sleep(3000);
		password.sendKeys("admin123");
		login.click();

	}

}
