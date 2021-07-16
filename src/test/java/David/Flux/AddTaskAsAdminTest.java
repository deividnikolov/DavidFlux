package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTaskAsAdminTest extends Browser {
	
	/*
	 * Login to FluxDay as an admin
	 * Click the "Team" button
	 * Click the "Add Task" button
	 * Wait until the "Task Page" is displayed
	 * Assert that the page is displayed
	 * Click logout
	 **/	
	
	@Test(priority = 0)
	public void addATaskAsAnAdmin() {
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Browser.home.clickOnTeamButton();
		Browser.team.clickOnAddTaskButton();	
		
	     WebDriverWait wait = new WebDriverWait(driver,10);
		 boolean isDisplayed = wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//div[@class='small-12 columns form-action-up']"))).isDisplayed();
		Assert.assertTrue(isDisplayed);
		
		Browser.home.clickOnLogoutButton();
	}		
}
