package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	@Given("Click on Find Lead")
	public void Click_on_FindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("Click on Phone from findby")
	public void click_on_phone_from_findby() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Enter the phone number to Edit {string}")
	public void edit_phonenum(String phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	}
	@Given("Click on Find Lead Button")
	public void click_on_find_lead_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("Select the Lead from the Table List")
	public void select_the_lead_from_the_table_list() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Given("Click on Edit Button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Given("Update company name as {string}")
	public void update_company_name_as(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}
	@When("Click on update button")
	public void click_on_update_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Edited Lead details updated")
	public void edited_lead_details_updated() {
	  System.out.println("Lead is updated");
	}


}
