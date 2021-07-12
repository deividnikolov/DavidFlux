package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class represents a class object linked to https://app.fluxday.io/projects/new#pane3

public class NewDepartmentPage {
	
	private WebDriver driver;
	private By createDepartment = By.linkText("Create department");
	private By projectName = By.id("project_name");
	private By projectCode = By.id("project_code");
	private By projectUrl = By.id("project_website");
	private By projectDescription = By.id("project_description");

	public NewDepartmentPage(WebDriver driver) {
		this.driver = driver;
	}
	// Click on create new department
	public void clickCreateNewDepartment() {
		driver.findElement(createDepartment).click();
	}
	// Set the project name
	public void setProjectName(String nameInput) {
		driver.findElement(projectName).sendKeys(nameInput);	
	}
	// Set the project code
	public void setProjectCode(String codeInput) {
		driver.findElement(projectCode).sendKeys(codeInput);
	}
	// Set the project URL
	public void setProjectUrl(String urlInput) {
		driver.findElement(projectUrl).sendKeys(urlInput);
	}
	// Set the project description
	public void setProjectDescription(String descriptionInput) {
	    driver.findElement(projectDescription).sendKeys(descriptionInput);
	}
	// Create the new department for an admin user
	public void createTheNewDepartment(String nameInput,String codeInput,String urlInput,String descriptionInput) {
		this.setProjectName(nameInput);
		this.setProjectCode(codeInput);
		this.setProjectUrl(urlInput);
		this.setProjectDescription(descriptionInput);
		
	}
		
}
