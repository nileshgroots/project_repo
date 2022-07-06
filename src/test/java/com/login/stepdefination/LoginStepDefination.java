package com.login.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageMethods.driverInitiate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	driverInitiate obj = new driverInitiate();

	@Given("navigate to the login page")
	public void navigate_to_the_login_page() throws InterruptedException {
		System.out.println(" I am at the login page");
		obj.navigate(obj.getDriver());
		
	}
	
	 
	 @When("user enters username in name field")
	 public void user_enters_username_in_name_field() throws InterruptedException {
		 
		obj.username(obj.getDriver());
	   
	 }
	 
	 
	 
}
	 
	 

	/*
	 * @Given("user is on login page") public void user_is_on_login_page() {
	 * 
	 * // LoginStepDefination login = new LoginStepDefination();
	 * 
	 * }
	 * 
	 * @When("user enters {string} in username field") public void
	 * user_enters_in_username_field(String UserName) {
	 * 
	 * driver.findElement(By.id("name")).sendKeys(UserName);
	 * 
	 * }
	 */
	/*
	 * @When("user enters {string} in password field") public void
	 * user_enters_in_password_field(String Password) {
	 * 
	 * driver.findElement(By.id("password")).sendKeys(Password);
	 * 
	 * }
	 * 
	 * @When("user clicks Sign in button") public void user_clicks_sign_in_button()
	 * {
	 * 
	 * driver.findElement(By.id("login")).click();
	 * 
	 * }
	 * 
	 * @Then("user navigates to Home Screen.") public void
	 * user_navigates_to_home_screen() {
	 * 
	 * String title = driver.getTitle(); System.out.println(title);
	 * 
	 * }
	 * 
	 * @Given("User is on Home page") public void user_is_on_home_page() {
	 * 
	 * }
	 * 
	 * @When("User click on logout button") public void
	 * user_click_on_logout_button() {
	 * 
	 * }
	 * 
	 * @Then("User Redirected to Sign Up Page") public void
	 * user_redirected_to_sign_up_page() {
	 * 
	 * }
	 */


