package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class LoginSecondEmployeeTest extends Initializer{

	/**
	 * Login to FluxDay as the second employee
	 * Assert that you're logged in as the second employee
	 * Click logout
	 */	
	
	@Test
	public void should_Login_As_Second_Employee() 
	{
		Browser.instance().loginPage.loginToFluxDay("emp2@fluxday.io", "password");
		Assert.assertTrue(Browser.instance().driver.findElement(By.linkText("Employee 2")).getText()
				.contains("Employee 2"));
		Browser.instance().homePage.clickOnLogoutButton();
	}

}
