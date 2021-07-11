package David.Flux;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTeamLeadTest extends Browser {

	/*
	 * Login to FluxDay as the team lead
	 * Assert that you're logged in as the team lead
	 * Click logout
	 **/	
	
	@Test(priority = 0)
	public void loginAsTeamLead() {
		Browser.login.loginToFluxDay("lead@fluxday.io", "password");
		Assert.assertTrue(driver.findElement(By.linkText("Team Lead")).getText()
				.contains("Team Lead"));
		Browser.home.clickOnLogoutButton();
	}

}
