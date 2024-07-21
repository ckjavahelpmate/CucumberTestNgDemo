package stefdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	WebDriver driver;

	@Given("data given")
	public void data_given() {
		System.out.println("Data Given");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@When("data processed")
	public void data_processed() {
		System.out.println("Data processed");
	}

	@Then("data validated")
	public void data_validated() {
		System.out.println("Data validated");
		driver.quit();
	}
	
	@Then("data validated2")
	public void data_validated2() {
		System.out.println("data validated 2");
//	   Assert.assertTrue(false);
		System.out.println("hi");
	}
	

}
