package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class represents a class object linked to https://app.fluxday.io/

public class HomePage {

	private WebDriver driver;
	private By departmentsButton = By.linkText("Departments");
	private By teamButton = By.linkText("Team");
	private By clickOnLogoutButton = By.linkText("Logout");
	private By clickOnOkrButton = By.linkText("OKR");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	//Click the departments button
	public void clickOnDepartmentsButton() {
		driver.findElement(departmentsButton).click();
	}

	//Click the team button
	public void clickOnTeamButton() {
		driver.findElement(teamButton).click();
	}

	//Click the logout button
	public void clickOnLogoutButton() {
		driver.findElement(clickOnLogoutButton).click();
	}

	//Click the OKR button
	public void clickOnOkrButton() {
		driver.findElement(clickOnOkrButton).click();
	}
}