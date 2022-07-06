package PageMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class driverInitiate {
	
	public static WebDriver driver;
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovoi\\eclipse-workspace\\NewDemoProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

public void navigate(WebDriver driver) throws InterruptedException {
	
	driver.get("https://example.testproject.io/web/");
			Thread.sleep(3000);
			System.out.println(" navigated successfully");
}

	
	



public void username (WebDriver driver) throws InterruptedException {
	
driver.findElement(By.id("name")).sendKeys("Baner");
Thread.sleep(3000);

}



	

	   public WebDriver getDriver() {
	      return driver;
	   }

	   public void teardown() {
		   driver.quit();
	   }
	
}
