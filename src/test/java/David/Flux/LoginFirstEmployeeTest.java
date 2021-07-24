package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class LoginFirstEmployeeTest extends Initializer{
 
	/**
	 * Login to FluxDay as the first employee
	 * Assert that you're logged in as the first employee
	 * Click logout
	 */	
	
	@Test
	public void login_As_First_Employee() 
	{
		Browser.instance().loginPage.loginToFluxDay("emp1@fluxday.io", "password");		
		Assert.assertTrue(Browser.instance().driver.findElement(By.linkText("Employee 1")).getText()
				.contains("Employee 1"));
		Browser.instance().homePage.clickOnLogoutButton();
		
	}
}
