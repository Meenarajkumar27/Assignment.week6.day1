package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass {
	String text;
	@Given("Click delete button")
	public void click_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Given("Search the Deleted Lead ID")
	public void search_the_deleted_lead_id() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
	}
	@When("No record is displayed")
	public void no_record_is_displayed() {
		if (text.contains("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	@Then("Lead is deleted")
	public void lead_is_deleted() {
	    System.out.println("Lead is deleted");
	}

}
