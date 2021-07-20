package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSecondEmployeeTest extends Browser {

	/**
	 * Login to FluxDay as the second employee
	 * Assert that you're logged in as the second employee
	 * Click logout
	 */	
	
	@Test(priority = 0)
	public void loginAsSecondEmployee() 
	{
		Browser.login.loginToFluxDay("emp2@fluxday.io", "password");
		Assert.assertTrue(driver.findElement(By.linkText("Employee 2")).getText()
				.contains("Employee 2"));
		Browser.home.clickOnLogoutButton();
	}

}
