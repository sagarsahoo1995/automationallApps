package automationCommonPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonPage {

	public static WebDriver driver;

	public static Properties prop;

	// Create Constructor to initiate the properties file.

	public CommonPage() {

		prop = new Properties();

		FileInputStream fis;
		try {
			fis = new FileInputStream("D:\\EclipseWorkPlace\\automation\\src\\main\\java\\utils\\config.propeties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initilization() {

		String browsername = prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
			

		}

	}

	public void tearDown() {

		driver.close();
	}



}
