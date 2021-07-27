package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class LoginTeamLeadTest extends Initializer {

	/**
	 * Login to FluxDay as the team lead
	 * Assert that you're logged in as the team lead
	 * Click logout
	 */	
	
	@Test
	public void should_Login_As_Team_Lead() 
	{
		Browser.instance().loginPage.loginToFluxDay("lead@fluxday.io", "password");
		Assert.assertTrue(Browser.instance().driver.findElement(By.linkText("Team Lead")).getText()
				.contains("Team Lead"));
		Browser.instance().homePage.clickOnLogoutButton();
	}

}
