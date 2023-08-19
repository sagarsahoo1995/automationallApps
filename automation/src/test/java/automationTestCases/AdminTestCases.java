package automationTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationCommonPages.CommonPage;
import automationPages.AdminPage;

public class AdminTestCases extends CommonPage {

	public AdminTestCases() {

		super();

	}

	AdminPage admin = new AdminPage();

	@BeforeMethod

	public void setUp() {

		initilization();
	}

	@Test
	public void loginToHRM() throws InterruptedException {

		admin.login();
	}

	// @AfterMethod
	public void tearDown() {

		tearDown();

	}

}
