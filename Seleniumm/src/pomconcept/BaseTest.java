package pomconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import mainjava.BaseClass;
import mainjava.DashBoardPage;
import mainjava.LoginPage;
import mainjava.PimPage;
import org.testng.annotations.AfterSuite;

public class BaseTest extends BaseClass{
	
	@BeforeSuite
	public void initBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	@BeforeClass
	public void pageObjects() {
		loginPage = new LoginPage(driver);
		dashboardPage = new DashBoardPage(driver);
		pimPage = new PimPage(driver);
	}
	@AfterClass
	public void logOutUser() {
		dashboardPage.logOut();
	
	}
	@AfterSuite
	public void logoutUser() {
		driver.quit();
	}
	
}
