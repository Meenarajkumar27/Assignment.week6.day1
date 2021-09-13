package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	

//	@Given("Open the chrome browser")
//	public void openBrowser() {
//		
//
//	}

//	@Given("Load the application {string}")
//	public void launchUrl(String url) {
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	}

	@Given("Click on create Lead Button")
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Given("Enter firstname field as {string}")
	public void enterFname(String fname) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@Given("Enter Lastname field as {string}")
	public void enterLastname(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		// driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

	}
	@Given("Enter the Company name {string}")
	public void entercompany(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		// driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

	}
	
	@Given("Enter the phone number {string}")
	public void enterPhonenum(String phone) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
	}
	@When("Click on submit Button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();
		

	}

	@Then("Lead should be created")
	public void displayed() {
		String TilteofthePage="View Lead | opentaps CRM";
	  	 String title=driver.getTitle();
if(TilteofthePage.equals(title))
{
	System.out.println(title);
	System.out.println("Lead is created as expected"); 
}
else
{
	System.out.println("Lead not created"); 
} 
	



	}
	
		
	}
