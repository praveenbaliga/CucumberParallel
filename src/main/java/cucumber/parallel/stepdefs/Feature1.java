package cucumber.parallel.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature1 {
    @Given("user is on the browser")
    public void userIsOnTheBrowser() {
        System.out.println("User on the browser : Feature 1");
    }

    @When("user searches for a text")
    public void userSearchesForAText() {
        System.out.println("User searches for a text : Feature 1");
    }

    @Then("user should see the text displayed")
    public void userShouldSeeTheTextDisplayed() {
        System.out.println("User observes the text display : Feature 1");
    }
}
