package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteNewTeamDepartmentsTest extends Browser {

	/*
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
	 **/		
	
	@Test(priority = 0)
	public void deleteTheNewTeamInDepartments() 
	{
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Browser.home.clickOnDepartmentsButton();
		
		Browser.departments.clickOnNewTeamButton();
		Browser.departments.addTheNewTeam("Name", "Code", "Description");
		
		Browser.departments.clickOnTheNut();
		Browser.departments.deleteTheTaskTeam();	
		driver.switchTo().alert().accept();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		 boolean isDisplayed = wait.until(ExpectedConditions.presenceOfElementLocated
		       (By.xpath("//div[@class='pane2-meta']"))).isDisplayed();
		 Assert.assertTrue(isDisplayed);		
		 Browser.home.clickOnLogoutButton();
	}
}
