package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTaskAsAdminTest extends Browser {
	
	/*
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
	 **/		
			
	private String expectedMessage = "Task was successfully created.";			
	private String actualMessage = "Task was successfully created.";
	
	@Test(priority = 0)
	public void createTaskAsAnAdmin() 
	{
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Browser.home.clickOnTeamButton();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated
		(By.xpath("//a[@href='/tasks/new?team_id=11']"))).isDisplayed();
		
		Browser.team.clickOnAddTaskButton();
		Browser.task.taskPageCreate("Title","Description");
		
		WebElement option = driver.findElement(By.cssSelector("option[value='2']"));
		option.click();
		
		Browser.task.clickOnTheCreateTaskButton();
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		
		Browser.task.addTheComment("Comment");
		driver.findElement(By.id("comment_body")).sendKeys(Keys.RETURN);
		Browser.home.clickOnLogoutButton();		
		
	}
}
