package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewTeamDepartmentsTest extends Browser {
	
	/*
	 * Login to FluxDay as an admin
	 * Wait until the "Departments" button is ready to be clicked
	 * Click the "Departments" button
	 * Click the "New" team button
	 * Add the name, the code and the description and click "Save"
	 * Assert that the expected message is correct
	 * Click logout	
	 **/		
	
	private String expectedMessage = "Team was successfully created.";
	private String actualMessage = "Team was successfully created.";

	@Test(priority = 0)
	public void addNewTeamInDepartments() 
	{	
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable
	    (By.linkText("Departments"))).click();
		
		Browser.departments.clickOnNewTeamButton();
		
		Browser.departments.addTheNewTeam("Name","Code","Description");
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.home.clickOnLogoutButton();
	}
		
}
