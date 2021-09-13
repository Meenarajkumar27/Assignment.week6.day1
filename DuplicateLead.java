package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass {
	String text1, text2;

	@Given("Click email tab")
	public void click_email_tab() {
		driver.findElementByLinkText("Email").click();
	}

	@Given("Enter email id as {string}")
	public void enter_emailid(String Emailid) {
		driver.findElement(By.name("emailAddress")).sendKeys(Emailid);
	}

	@Given("Click find Lead button from email tab")
	public void click_find_lead_button_from_email_tab() throws InterruptedException {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
	}

	@Given("Get the firstname from the Lead list table and Click on it")
	public void get_the_firstname_from_the_lead_list_table_and_click_on_it() {
		WebElement Name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
		text1 = Name.getText();
		Name.click();
	}

	@Given("Get the Title of the page")
	public void get_the_title_of_the_page() {
		driver.findElementByXPath("(//div[@class='frameSectionExtra'])[2]/a[1]").click();
		System.out.println("Title is:" + driver.getTitle());
	}

	@Given("Get the firstname from Duplicate Lead screen")
	public void get_the_firstname_from_duplicate_lead_screen() {
		text2 = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
	}

	@Given("Click create Lead button from Duplicate lead Screen")
	public void click_create_lead_button_from_duplicate_lead_screen() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@When("Check the existing Lead first name and duplicate lead created firstname is same")
	public void check_the_existing_lead_first_name_and_duplicate_lead_created_firstname_is_same() {
		if (text1.equals(text2)) {
			System.out.println("The lead is duplicate");
		}
	}

	@Then("Duplicate lead is created")
	public void duplicate_lead_is_created() {
		System.out.println("Duplicate lead is created");
	}

}
