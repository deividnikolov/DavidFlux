package David.Flux;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.Browser;

public class Initializer {

	private String loginUrl =
			"https://app.fluxday.io/users/sign_in";
	private String driverPath =
			"C:\\Users\\User\\Desktop\\Java\\DavidFlux\\driver\\chromedriver.exe";

	@BeforeSuite
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		Browser.instance().driver.manage().window().maximize();
		Browser.instance().driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Browser.instance().driver.get(loginUrl);
	}

	@AfterSuite
	public void tearDown() 
	{
		Browser.instance().driver.quit();
	}
}
