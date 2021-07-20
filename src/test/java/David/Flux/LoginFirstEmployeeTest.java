package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFirstEmployeeTest extends Browser {
 
	/**
	 * Login to FluxDay as the first employee
	 * Assert that you're logged in as the first employee
	 * Click logout
	 */	
	
	@Test(priority = 0)
	public void loginAsFirstEmployee() 
	{
		Browser.login.loginToFluxDay("emp1@fluxday.io", "password");		
		Assert.assertTrue(driver.findElement(By.linkText("Employee 1")).getText()
				.contains("Employee 1"));
		Browser.home.clickOnLogoutButton();
		
	}
}
