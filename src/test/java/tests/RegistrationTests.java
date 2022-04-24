package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

class RegistrationTests extends BaseTest {

	@Test
	void validateErrorMessage() throws InterruptedException {
		
		RegistrationPage registrationPage = homePage.goToRegistrationPage();
		registrationPage.clickSubmitButton();
		assertEquals(
				registrationPage.getErrorMessageText(),
				"Please enter the first name");
		registrationPage.enterFirstName("John");
		assertNotEquals(
				registrationPage.getErrorMessageText(),
				"Please enter the first name");
		
	}
	
}
