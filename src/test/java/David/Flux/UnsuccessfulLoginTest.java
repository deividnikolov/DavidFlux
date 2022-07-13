package David.Flux;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class UnsuccessfulLoginTest extends Initializer {

	/**
	 * Login to FluxDay with wrong password
	 * Assert that you get the message : "Invalid email or password"
	 * Clear the username text field
	 */		
	
	private String expectedMessage = "Invalid email or password.";
	private String actualMessage = "Invalid email or password.";

	@Test
	public void should_Not_Login_With_Wrong_Credentials() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "passwordd");
		Assert.assertEquals(actualMessage, expectedMessage);
		Browser.instance().loginPage.clearTextField();

	}
}
