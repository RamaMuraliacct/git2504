package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
WebDriver driver;

@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
   driver=new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^the user enters the valid username$")
public void the_user_enters_the_valid_username()  {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
    
}

@When("^password and clicks on the login button$")
public void password_and_clicks_on_the_login_button()  {
	driver.findElement(By.id("txtPassword")).sendKeys("rama");
	driver.findElement(By.id("btnLogin")).click();
   
}

@Then("^user should navigated to homepage$")
public void user_should_navigated_to_homepage()  {
    
}

}
