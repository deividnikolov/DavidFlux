package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class AddTaskAsAdminTest extends Initializer {
	
	/**
	 * Login to FluxDay as an admin
	 * Click the "Team" button
	 * Click the "Add Task" button
	 * Wait until the "Task Page" is displayed
	 * Assert that the page is displayed
	 * Click logout
	 */	
	
	@Test
	public void add_Task_As_An_Admin() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Browser.instance().homePage.clickOnTeamButton();
		Browser.instance().teamPage.clickOnAddTaskButton();	
		
	     WebDriverWait wait = new WebDriverWait(Browser.instance().driver,10);
		 boolean isDisplayed = wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//div[@class='small-12 columns form-action-up']"))).isDisplayed();
		Assert.assertTrue(isDisplayed);
		
		Browser.instance().homePage.clickOnLogoutButton();
	}		
}
