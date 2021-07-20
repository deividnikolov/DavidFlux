package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateDepartmentTest extends Browser {

	/**
	 * Login to FluxDay as an admin
	 * Click the "Department" button
	 * Wait until "Create New Department" button is displayed
	 * Click it
	 * Create the new department by adding the title,code,url,description
	 * Select the "Admin User" as the manager from the drop down and click it 
	 * Click the save button
	 * Assert that the project was created
	 * Click logout
	 */		
	
	private String expectedMessage = "Project was successfully created.";
	private String actualMessage = "Project was successfully created.";

	@Test(priority = 0)
	public void createNewDepartment() 
	{
		Browser.login.loginToFluxDay("admin@fluxday.io", "password");
		Browser.home.clickOnDepartmentsButton();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated
		 (By.linkText("Create department"))).click();

		Browser.newDept.createTheNewDepartment("Quality Assurance", "Code", "http://www.test1.org", "QA");

		WebElement dropdown = driver.findElement(By.cssSelector("option[value = '4']"));
		dropdown.click();
		Browser.departments.clickOnTheSaveButton();
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.home.clickOnLogoutButton();

	}
}
