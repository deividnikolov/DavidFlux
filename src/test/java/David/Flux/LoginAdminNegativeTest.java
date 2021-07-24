package David.Flux;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class LoginAdminNegativeTest extends Initializer {

	/**
	 * Login to FluxDay with wrong password
	 * Assert that you get the message : "Invalid email or password"
	 * Clear the user name text field
	 */		
	
	private String expectedMessage = "Invalid email or password.";
	private String actualMessage = "Invalid email or password.";

	@Test
	public void login_With_Wrong_Credentials() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "passwordd");
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.instance().loginPage.clearTextField();

	}
}
