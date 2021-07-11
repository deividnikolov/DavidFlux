package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class represents a class object linked to https://app.fluxday.io/teams#pane2

public class TeamsPage {

	private WebDriver driver;
	private By addTaskButton = By.xpath("//a[@href='/tasks/new?team_id=11']");

	public TeamsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Click on add task button
	public void clickOnAddTaskButton() {
		driver.findElement(addTaskButton).click();
	}
}