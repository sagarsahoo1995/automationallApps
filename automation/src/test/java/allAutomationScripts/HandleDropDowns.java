package allAutomationScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	WebDriver driver;

	public void takescreenshots() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\EclipseWorkPlace\\automation\\Scennshots\\test.png");
		FileUtils.copyFile(source, target);

	}

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void dropdowmbyselectclass() throws Throwable {
		driver.get("https://www.amazon.in/");
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		// Create Select class object

		Select drop = new Select(allDropdown);
		Thread.sleep(3000);
		drop.selectByIndex(2);
		takescreenshots(); 

	}

}
