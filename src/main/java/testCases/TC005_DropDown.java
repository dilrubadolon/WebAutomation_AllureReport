package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.driverSetup;

public class TC005_DropDown extends driverSetup {
	public static String baseurl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(enabled = true)
	public static void selectingValueFromDropDown() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.name("cars"));
		Select s = new Select(e);
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build()
				.perform();

		Thread.sleep(3000);
		// s.selectByIndex(1);
		// Thread.sleep(3000);}
		driver.switchTo().defaultContent();

	}
}
