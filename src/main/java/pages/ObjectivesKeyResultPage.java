package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class represents a class object linked to https://app.fluxday.io/users/FT1/okrs/new#pane3

public class ObjectivesKeyResultPage {
	
	private WebDriver driver;
	private By clickNewOkrButton = By.xpath("//a[@href='/users/FT1/okrs/new']");
	private By nameInput = By.id("okr_name");
	private By objectiveInput = By.xpath("//input[@id='okr_objectives_attributes_0_name']");
	private By firstKeyResultInput = By.id("okr_objectives_attributes_0_key_results_attributes_0_name");
	private By secondKeyReusltInput = By.id("okr_objectives_attributes_0_key_results_attributes_1_name");
	private By clickSaveButton = By.xpath("//input[@class='button alert right']");

	public ObjectivesKeyResultPage(WebDriver driver) {
		this.driver = driver;
	}

    //Click on new OKR button
	public void clickOnNewOkrButton() {
		driver.findElement(clickNewOkrButton).click();
	}
    //Add the name
	public void setTheNameForTheOkr(String name) {
		driver.findElement(nameInput).sendKeys(name);
	}
	//Add the objective
	public void setTheObjectiveForTheOkr(String obj) {
		driver.findElement(objectiveInput).sendKeys(obj);
	}
	//Add the first key result
	public void setTheFirstKeyResult(String firstKey) {
		driver.findElement(firstKeyResultInput).sendKeys(firstKey);
	}
	//Add the second key result
	public void setTheSecondKeyResult(String secondKey) {
		driver.findElement(secondKeyReusltInput).sendKeys(secondKey);
	}
	//Click the save button
	public void clickOnTheSaveButton() {
		driver.findElement(clickSaveButton).click();
	}
	//Set the OKR for the Admin User
	public void setTheOkrForTheAdminUser(String name, String obj, String firstKey, String secondKey) {
	 this.setTheNameForTheOkr(name);
     this.setTheObjectiveForTheOkr(obj);
     this.setTheFirstKeyResult(firstKey);
     this.setTheSecondKeyResult(secondKey);
  }	
}
