package David.Flux;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddNewTeamDepartmentsTest extends Initializer {

	/**
	 * Login to FluxDay as an admin
	 *  Wait until the "Departments" button is ready to be clicked
	 *  Click the "Departments" button 
	 *  Click the "New" team button 
	 *  Add the name, the code and the description and click "Save" 
     *  Assert that the expected message is correct 
	 *  Click logout
	 */

	private String expectedMessage = "Team was successfully created.";
	private String actualMessage = "Team was successfully created.";

	@Test
	public void should_Add_New_Team_In_Departments() {
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		WebDriverWait wait = new WebDriverWait(Browser.instance().driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Departments"))).click();

		Browser.instance().departmentsPage.clickOnNewTeamButton();

		Browser.instance().departmentsPage.addTheNewTeam("Name", "Code", "Description");
		assertEquals(actualMessage, expectedMessage);
		Browser.instance().homePage.clickOnLogoutButton();
	}

}
