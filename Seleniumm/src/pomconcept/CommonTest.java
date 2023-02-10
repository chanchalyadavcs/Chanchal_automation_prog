package pomconcept;

import java.util.concurrent.TimeUnit;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;

import dev.failsafe.internal.util.Assert;



public class CommonTest extends BaseTest {
	@BeforeClass
	public void login() { 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.addusrnm("Admin");
		loginPage.addpass("admin123");
		loginPage.logintoPage();
		String titleOfDash = dashboardPage.titleofDashBoard();
		AssertJUnit.assertEquals(titleOfDash, "Dashboard");
	}

}
