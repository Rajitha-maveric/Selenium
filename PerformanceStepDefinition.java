package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForPerformance {
	 WebDriver driver=new ChromeDriver();

	@Given("User logged in to check performance of employee")
	public void user_logged_in_to_check_performance_of_employee() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span")).click();
		Thread.sleep(1000);

	}

	@Given("User select the option Employee Tracker")
	public void user_select_the_option_My_tracker() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a")).click();
		Thread.sleep(1000);

	}

	@When("User select view option")
	public void user_select_view_option() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]/div[2]/div/div/button")).click();
		Thread.sleep(1000);
	}

	@Then("User should be able to select add log option")
	public void user_should_be_able_to_select_add_log_option() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]/div[2]/div/div/button")).click();
		Thread.sleep(1000);

	}

}
