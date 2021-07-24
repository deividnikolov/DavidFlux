package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static Browser instance = new Browser();

	public WebDriver driver;
	public LoginPage loginPage;
	public TeamsPage teamPage;
	public DepartmentsPage departmentsPage;
	public TaskPage taskPage;
	public HomePage homePage;
	public ObjectivesKeyResultPage okrPage;
	public NewDepartmentPage newDeptPage;

	public static Browser instance() 
	{

		return Browser.instance;
	}

	private Browser() 
	{
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		teamPage = new TeamsPage(driver);
		departmentsPage = new DepartmentsPage(driver);
		taskPage = new TaskPage(driver);
		homePage = new HomePage(driver);
		okrPage = new ObjectivesKeyResultPage(driver);
		newDeptPage = new NewDepartmentPage(driver);
		
	}
}