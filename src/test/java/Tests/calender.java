package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	WebDriver driver;

	@Test
	public void makemytrip() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(
				driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-frame\"]")));

		
		
		
		
		driver.findElement(By.xpath("//*[@class=\"wewidgeticon we_close\"]")).click();
		
		
		Actions action = new Actions(driver);
		
		
		WebElement dep = driver.findElement(By.xpath("//*[@for=\"departure\"]"));
		  
		
	

		

	

		action.moveToElement(dep).click().build().perform();

		
		driver.quit();
		
	}

}
