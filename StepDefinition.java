package org.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver;
@Given("user Launch the adactin hotel web application")
public void userLaunchTheAdactinHotelWebApplication() {
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}

@When("user enter valid username and password")
public void userEnterValidUsernameAndPassword() {
	 driver.findElement(By.id("username")).sendKeys("AravinthKrish");
	 driver.findElement(By.id("password")).sendKeys("ABC@123");
}

@When("click the login button")
public void clickTheLoginButton() {
	driver.findElement(By.name("login")).click();
}

@Then("verify user able to view the search hotel page")
public void verifyUserAbleToViewTheSearchHotelPage() {
	System.out.println("search hotel page should be displayed");
}

@When("Seclect valid Location,valid Hotel name,valid Room type")
public void seclectValidLocationValidHotelNameValidRoomType() {
	WebElement element=driver.findElement(By.id("location"));
	WebElement element1=driver.findElement(By.id("hotels"));
	WebElement element2 = driver.findElement(By.id("room_type"));
	Select s1=new Select(element);
	s1.selectByValue("New York");
	Select s2=new Select(element1);
	s2.selectByValue("Hotel Creek");
	Select s3=new Select(element2);
	s3.selectByValue("Super Deluxe");
}

@When("click the search button")
public void clickTheSearchButton() {
	driver.findElement(By.id("Submit")).click();
}

@Then("verify user able to view the next hotel page")
public void verifyUserAbleToViewTheNextHotelPage() {
	System.out.println("next hotel page should be displayed");
}

@When("click on rodio button and continue button")
public void clickOnRodioButtonAndContinueButton() {
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
}

@Then("verify user able to view the Book A Hotel page")
public void verifyUserAbleToViewTheBookAHotelPage() {
	 System.out.println("Book A hotel page should be displayed");
}

@When("Enter the Valid First Name,valid Last Name,valid Billing Address and vaid Credit card Number")
public void enterTheValidFirstNameValidLastNameValidBillingAddressAndVaidCreditCardNumber() {
	driver.findElement(By.name("first_name")).sendKeys("Aravinth");
	driver.findElement(By.name("last_name")).sendKeys("K");
	driver.findElement(By.name("address")).sendKeys("Thoraipakkam i chennai");
	driver.findElement(By.name("cc_num")).sendKeys("4567845213456786");
}

@When("Select valid Credit card type,Valid Expiry date and valid CVV number")
public void selectValidCreditCardTypeValidExpiryDateAndValidCVVNumber() {
	 WebElement element3 = driver.findElement(By.name("cc_type"));	
     WebElement element4 = driver.findElement(By.name("cc_exp_month"));
     WebElement element5 = driver.findElement(By.name("cc_exp_year"));
     
     Select s4=new Select(element3);
     s4.selectByIndex(1);
     Select s5=new Select(element4);
     s5.selectByValue("8");
     Select s6=new Select(element5);
     s6.selectByValue("2024");
     
     driver.findElement(By.name("cc_cvv")).sendKeys("134");
}

@When("click on the Book Now button")
public void clickOnTheBookNowButton() {
	 driver.findElement(By.name("book_now")).click();
}

@Then("verify user able to view the Booking Confirmation page should be displayed")
public void verifyUserAbleToViewTheBookingConfirmationPageShouldBeDisplayed() {
	 System.out.println("Booking confirmation page should be displayed");
}

@When("print the order number")
public void printTheOrderNumber() {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
     WebElement element6 = driver.findElement(By.id("order_no"));
     String text = element6.getAttribute("value");
     System.out.println(text);
}

@Then("order number should be printed")
public void orderNumberShouldBePrinted() {
	System.out.println("order number should be displayed");
}

@When("user enter valid {string} and valid {string}")
public void userEnterValidAndValid(String user, String pass) {
	 driver.findElement(By.id("username")).sendKeys(user);
	 driver.findElement(By.id("password")).sendKeys(pass);
}

@When("click on login button")
public void clickOnLoginButton() {
    driver.findElement(By.id("login")).click();
}

@Then("user able to view the error message")
public void userAbleToViewTheErrorMessage() {
   System.out.println("error messege should be displayed");
}


}
