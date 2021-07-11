package David.Flux;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.DepartmentsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ObjectivesKeyResultPage;
import pages.TaskPage;
import pages.TeamsPage;

public class Browser {
	
    static WebDriver driver;
	static LoginPage login;
	static TeamsPage team;
	static DepartmentsPage departments;
	static TaskPage task;
	static HomePage home;
	static ObjectivesKeyResultPage okr;
	static String loginUrl = "https://app.fluxday.io/users/sign_in";
	String driverPath = "C:\\Users\\User\\Desktop\\Java\\DavidFlux\\driver\\chromedriver.exe";

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		team = new TeamsPage(driver);
		departments = new DepartmentsPage(driver);
		task = new TaskPage(driver);
		home = new HomePage(driver);
		okr = new ObjectivesKeyResultPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(loginUrl);
	 }

	@AfterSuite
	public void tearDown(){
		driver.quit();
		
     }
}