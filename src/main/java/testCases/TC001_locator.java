package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.driverSetup;

public class TC001_locator extends driverSetup {
	String baseUrl = "https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=lPRxkuIi7QZ4wTbRIyYAZliJxp_SFBKXy78fy2pfwdR7LdSS_E7qRh0RROUo2upjXI1FZ3e0J14o8v_29HVm6A/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("Dilriuba");

		driver.findElement(By.name("password")).sendKeys("asjdf");

		driver.findElement(By.className("btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs")).click();

		System.out.println(
				driver.findElement(By.cssSelector("div.bodySmall m-b-3-xs text-center-xs auth-flash-error")).getText());
		Thread.sleep(2000);
		((WebElement) driver.findElements(By.xpath("//input[@type='email']"))).sendKeys("dolon");
		Thread.sleep(2000);
		// tagname[@attribute='value']

	}

}
