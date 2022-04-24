package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public RegistrationPage goToRegistrationPage() {
		driver.findElement(By.xpath("//div[contains(text(),'Register')]")).click();
		return new RegistrationPage(driver);
	}
	
	public CareersPage goToCareersPage() {
		driver.findElement(By.linkText("Career")).click();
		return new CareersPage(driver);
	}
}
