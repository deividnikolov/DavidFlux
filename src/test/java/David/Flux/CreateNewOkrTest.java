package David.Flux;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewOkrTest extends Browser {

	/*
	 * Login to FluxDay as an admin 
	 * Click the "OKR" button 
	 * Click the "New OKR" button
	 * Set the OKR for the admin by adding the name,objective,first key and second key
	 * Wait until the "Save" button is displayed 
	 * Click the save button
	 * Assert that the "OKR" is created
	 * Click logout
	 **/
	private String expectedMessage = "Okr was successfully created.";
	private String actualMessage = "Okr was successfully created.";

	@Test(priority = 0)
	public void createTheNewOkrForAnAdminUser() {
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Browser.home.clickOnOkrButton();
			
		Browser.okr.clickOnNewOkrButton();
		Browser.okr.setTheOkrForTheAdminUser("Name", "Objective", "FirstKey", "SecondKey");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//input[@class='button alert right']"))).isDisplayed();
				
		Browser.okr.clickOnTheSaveButton();

		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.home.clickOnLogoutButton();

	}
}
