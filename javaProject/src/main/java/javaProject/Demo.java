package javaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("PH");
		//List<WebElement> dp = driver.findElements(By.xpath("//*[@class='G43f7e']/li"));
		Thread.sleep(5000);
		List<WebElement> elementName = driver.findElements(By.xpath("//*[@class='G43f7e']/li"));
		
		System.out.println(elementName.size());

		for (int i = 0; i < elementName.size(); i++) {
			
			WebElement dp1 = elementName.get(i);
			if(dp1.getText().equalsIgnoreCase("Phone")) {
				
				
				dp1.click();
			}
			

		}

	}

}
