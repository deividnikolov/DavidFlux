package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// This class represents a class object linked to https://app.fluxday.io/teams#pane2

public class TaskPage {
	
	private WebDriver driver;
	private By titleInput = By.cssSelector("#task_name");
	private By descriptionInput = By.cssSelector("#task_description");
	private By createTaskButton = By.cssSelector(".button");
	private By addComment = By.id("comment_body");

	
	public TaskPage(WebDriver driver) {
		this.driver = driver;
	}

     //Set the task title
	public void setTheTaskTitle(String title) {
		driver.findElement(titleInput).sendKeys(title);
	}

	 //Set the task description
	public void setTheTaskDescription(String taskDes) {
		driver.findElement(descriptionInput).sendKeys(taskDes);
	}

	 //Click on the create task button
	public void clickOnTheCreateTaskButton() {
		driver.findElement(createTaskButton).click();
	}
	 //Add a comment after the task is created
	public void addTheComment(String comment) {
		driver.findElement(addComment).sendKeys(comment);
	}
		
     //Create the task
	public void taskPageCreate(String title, String taskDes) {
		this.setTheTaskTitle(title);
		this.setTheTaskDescription(taskDes);
		
	}
}