package David.Flux;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Browser;

public class CreateDepartmentTest extends Initializer{

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

	@Test
	public void should_Create_New_Department() 
	{
		Browser.instance().loginPage.loginToFluxDay("admin@fluxday.io", "password");
		Browser.instance().homePage.clickOnDepartmentsButton();
		WebDriverWait wait = new WebDriverWait(Browser.instance().driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated
		 (By.linkText("Create department"))).click();

		Browser.instance().newDeptPage.createTheNewDepartment
		("Quality Assurance", "Code", "http://www.test1.org", "QA");

		WebElement dropdown = Browser.instance().driver.findElement(By.cssSelector("option[value = '4']"));
		dropdown.click();
		Browser.instance().departmentsPage.clickOnTheSaveButton();
		Assert.assertTrue(expectedMessage.equals(actualMessage));
		Browser.instance().homePage.clickOnLogoutButton();

	}
}
