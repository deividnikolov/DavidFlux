package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAdminTest extends Browser {

	/*
	 * Login to FluxDay as an admin
	 * Assert that you're logged in as an admin
	 * Click logout
	 **/	
	
	@Test(priority = 0)
	public void loginAsAnAdmin() 
	{
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Assert.assertTrue(driver.findElement(By.linkText("Admin User")).getText()
				.contains("Admin User"));
		Browser.home.clickOnLogoutButton();
		
	}
}
