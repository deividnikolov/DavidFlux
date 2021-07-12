package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class represents a class object linked to https://app.fluxday.io/projects/1/teams/new#pane3

public class DepartmentsPage {
	
	private WebDriver driver;
	private By newTeamButton = By.xpath("//a[@href='/projects/1/teams/new']");
	private By nameField = By.id("team_name");
	private By codeField = By.id("team_code");
	private By descriptionField = By.id("team_description");
	private By saveButton = By.name("commit");
	private By nutButtonDelete = By.xpath("//div[@class='icon settings-link']");
	private By deleteTheTask = By.xpath("//a[@data-confirm='Are you sure you want to delete this team?']");
		
	public DepartmentsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Click the new team button
	public void clickOnNewTeamButton() {
		driver.findElement(newTeamButton).click();
	}
	//Set the name for the team
	public void setTheTeamName(String name) {
		driver.findElement(nameField).sendKeys(name);
	}
	//Set the code for the team
	public void setTheTeamCode (String code) {
		driver.findElement(codeField).sendKeys(code);
	}
	//Set the description for the team
	public void setTheTeamDescription(String description) {
		driver.findElement(descriptionField).sendKeys(description);
	}
	//Click the save button
	public void clickOnTheSaveButton() {
		driver.findElement(saveButton).click();
	}
	//Click the nut icon to access the delete button
	public void clickOnTheNut() {
		driver.findElement(nutButtonDelete).click();
	}
	//Click the delete option
	public void deleteTheTaskTeam() {
		driver.findElement(deleteTheTask).click();		
	}	
	//Add the new team
	public void addTheNewTeam(String name, String code, String description) {
		this.setTheTeamName(name);
		this.setTheTeamCode(code);
		this.setTheTeamDescription(description);
		this.clickOnTheSaveButton();	
		
		
	}	
}
