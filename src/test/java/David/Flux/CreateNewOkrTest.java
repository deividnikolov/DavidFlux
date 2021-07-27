package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class CreateNewOkrTest extends Initializer {

	/**
	 * Login to FluxDay as an admin 
	 * Click the "OKR" button 
	 * Click the "New OKR" button
	 * Set the OKR for the admin by adding the name,objective,first key and second key
	 * Wait until the "Save" button is displayed 
	 * Click the save button
	 * Assert that the "OKR" is created
	 * Click logout
	 */
	private String expectedMessage = "Okr was successfully created.";
	private String actualMessage = "Okr was successfully created.";

	@Test
	public void should_Create_The_New_Okr_For_An_Admin_User() 
	{   
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Browser.instance().homePage.clickOnOkrButton();
			
		Browser.instance().okrPage.clickOnNewOkrButton();
		Browser.instance().okrPage.setTheOkrForTheAdminUser("Name", "Objective", "FirstKey", "SecondKey");

		WebDriverWait wait = new WebDriverWait(Browser.instance().driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//input[@class='button alert right']"))).isDisplayed();
		
		Browser.instance().okrPage.clickOnTheSaveButton();
				
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.instance().homePage.clickOnLogoutButton();

	}
}
