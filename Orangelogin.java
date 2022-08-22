package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLoginSteps {
	 WebDriver driver=new ChromeDriver();
	@Given("User is in the login page for OrangeHRM")
	public void user_is_in_the_login_page_for_OrangeHRM() {
        System.setProperty("webdriver.chromedriver","chromedriver.exe");


	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	      //driver.findElement(By.name("username")).sendKeys("Admin");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		  Thread.sleep(1000);


	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(1000);


	}



}
