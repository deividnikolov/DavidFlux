package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class CreateTaskAsAdminTest extends Initializer{
	
	/**
	 * Login to FluxDay as an admin
	 * Click the "Team" button
	 * Wait until the "Task" page is located
	 * Click on the add task button
	 * Create the task by adding the title and description
	 * Select the "Testing" team from the drop down menu
	 * Click on create the task button
	 * Assert that the expected message is correct
	 * Add a comment and press the enter key
	 * Click logout
	 */		
			
	private String expectedMessage = "Task was successfully created.";			
	private String actualMessage = "Task was successfully created.";
	
	@Test
	public void create_Task_As_An_Admin() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Browser.instance().homePage.clickOnTeamButton();
		
		WebDriverWait wait = new WebDriverWait(Browser.instance().driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//a[@href='/tasks/new?team_id=11']"))).isDisplayed();
		
		Browser.instance().teamPage.clickOnAddTaskButton();
		Browser.instance().taskPage.taskPageCreate("Title","Description");
		
		WebElement option = Browser.instance().driver.findElement(By.cssSelector("option[value='2']"));
		option.click();
		
		Browser.instance().taskPage.clickOnTheCreateTaskButton();
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		
		Browser.instance().taskPage.addTheComment("Comment");
		Browser.instance().driver.findElement(By.id("comment_body")).sendKeys(Keys.RETURN);
		Browser.instance().homePage.clickOnLogoutButton();		
		
	}
}
