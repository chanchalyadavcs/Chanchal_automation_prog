package testngs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertt {
	
	public static WebDriver driver;
	static String url = "http://dthahab.com/Setting/Splash/Create";

	@BeforeTest
	public void InitBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
	
	@Test
	void verifyUrl() {
		String urll = driver.getCurrentUrl();
		SoftAssert sftasrt = new SoftAssert();
		sftasrt.assertEquals(urll, url, "verifying url");
		System.out.println("verify url run after softassert ");	
		sftasrt.assertAll();
	}
	@Test
	void verifyTitle() {
		String titles =driver.getTitle();
		SoftAssert sftasrt = new SoftAssert();
		sftasrt.assertEquals(titles, "Login | Dthahab","verifying title");
		System.out.println("verifying soft assert");
		sftasrt.assertAll();
	}
	@AfterTest
	void exit() {
		driver.quit();
	}
}

