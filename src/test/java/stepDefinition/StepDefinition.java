package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("User is on netbanking");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("User login into application");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Homepage is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Card is diplayed");
    }
}
