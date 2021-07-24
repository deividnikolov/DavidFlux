package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class represents a class object linked to https://app.fluxday.io/users/sign_in

public class LoginPage {
	
	private WebDriver driver;
	private By email = By.xpath("//input[@id='user_email']");
	private By password = By.id("user_password");
	private By loginButton = By.className("btn-login");
	private By clearTextField = By.xpath("//input[@id='user_email']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Set the email address
	public void setEmailAdrress(String mailAdrress) {
		driver.findElement(email).sendKeys(mailAdrress);
	}

	//Set the password
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	//Click on login button
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}

	//Login to fluxDay
	public void loginToFluxDay(String mailAdrress, String pass) {
		this.setEmailAdrress(mailAdrress);
		this.setPassword(pass);
		this.clickOnLoginButton();
	}

	//Clear the user name text field
	public void clearTextField() {
		driver.findElement(clearTextField).clear();
		
		
	}
}
