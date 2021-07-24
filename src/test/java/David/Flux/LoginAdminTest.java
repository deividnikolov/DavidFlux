package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class LoginAdminTest extends Initializer{

	/**
	 * Login to FluxDay as an admin
	 * Assert that you're logged in as an admin
	 * Click logout
	 */	
	
	@Test
	public void login_As_An_Admin() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Assert.assertTrue(Browser.instance().driver.findElement(By.linkText("Admin User")).getText()
				.contains("Admin User"));
		Browser.instance().homePage.clickOnLogoutButton();
		
	}
}
