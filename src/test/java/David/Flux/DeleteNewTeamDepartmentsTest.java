package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class DeleteNewTeamDepartmentsTest extends Initializer{

	/**
	 * Login to FluxDay as an admin
	 * Click the "Departments" button
	 * Click the "New" team button
	 * Add the name, the code and the description and click "Save"
	 * Click on the nut
	 * Choose the "Delete" option
	 * Accept the alert
	 * Wait until the "Teams" page is displayed
	 * Assert that is displayed
	 * Click logout 
	 */		
	
	@Test
	public void delete_The_New_Team_In_Departments() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Browser.instance().homePage.clickOnDepartmentsButton();
		
		Browser.instance().departmentsPage.clickOnNewTeamButton();
		Browser.instance().departmentsPage.addTheNewTeam("Name", "Code", "Description");
		
		Browser.instance().departmentsPage.clickOnTheNut();
		Browser.instance().departmentsPage.deleteTheTaskTeam();	
		Browser.instance().driver.switchTo().alert().accept();
		
		WebDriverWait wait = new WebDriverWait(Browser.instance().driver,10);
		 boolean isDisplayed = wait.until(ExpectedConditions.presenceOfElementLocated
		       (By.xpath("//div[@class='pane2-meta']"))).isDisplayed();
		 Assert.assertTrue(isDisplayed);		
		 Browser.instance().homePage.clickOnLogoutButton();
	}
}
