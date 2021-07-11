package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutAdminTest extends Browser {

	/*
	 * Login to FluxDay as an admin
	 * Click logout
	 * Wait until the "Login" page is displayed
	 * Assert that the "Login" page is displayed
	 **/	
	
	@Test(priority = 0)
	public void logoutAsAnAdmin() {
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Browser.home.clickOnLogoutButton();
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 boolean isDisplayed = wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//div[@class='app-logo-login']"))).isDisplayed();
		 Assert.assertTrue(isDisplayed);
				
		
	}

}
