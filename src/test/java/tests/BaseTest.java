package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;

class BaseTest {
	
	WebDriver driver;
	HomePage homePage;

	@BeforeAll
	 void setUpBeforeClass() throws Exception {
		 WebDriverManager.chromedriver().setup();
		
	}

	@AfterAll
	 void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.inoxmovies.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		homePage= new HomePage(driver);
	}
	
	@AfterEach
	public void tearDown() {
		driver.quit();
	}
}
