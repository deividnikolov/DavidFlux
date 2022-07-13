package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

import java.time.Duration;

public class LogoutAdminTest extends Initializer {

	/**
	 * Login to FluxDay as an admin
	 * Click logout
	 * Wait until the "Login" page is displayed
	 * Assert that the "Login" page is displayed
	 */	
	
	@Test
	public void should_Logout_As_An_Admin() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Browser.instance().homePage.clickOnLogoutButton();
		
		 WebDriverWait wait = new WebDriverWait(Browser.instance().driver, Duration.ofSeconds(10));
		 boolean isDisplayed = wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//div[@class='app-logo-login']"))).isDisplayed();
		 Assert.assertTrue(isDisplayed);
					
	}

}
