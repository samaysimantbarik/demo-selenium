package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSubmitButton() {
		driver.findElement(By.cssSelector(".BtnSubmit")).click();
	}

	public String getErrorMessageText() {
		return driver.findElement(By.cssSelector(".error-alert>div")).getText();
	}

	public void enterFirstName(String name) {

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name$='TxtFName']")))
				.sendKeys(name);
	}

	public void enterLastName(String name) {
		driver.findElement(By.cssSelector("input[name$='TxtFName']"))
				.sendKeys(name);
	}
}
