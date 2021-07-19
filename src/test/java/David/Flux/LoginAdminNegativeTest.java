package David.Flux;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAdminNegativeTest extends Browser {

	/*
	 * Login to FluxDay with wrong password
	 * Assert that you get the message : "Invalid email or password"
	 * Clear the user name text field
	 **/		
	
	private String expectedMessage = "Invalid email or password.";
	private String actualMessage = "Invalid email or password.";

	@Test(priority = 0)
	public void unsuccessfulLoginAsAnAdmin() 
	{
		Browser.login.loginToFluxDay("admin@fluxday.io", "passwordd");
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.login.clearTextField();

	}
}
