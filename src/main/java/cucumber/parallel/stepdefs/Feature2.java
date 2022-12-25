package cucumber.parallel.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature2 {
    @Given("user is on the browser feature {int}")
    public void userIsOnTheBrowserFeature(int arg0) {
        System.out.println("User on the browser : Feature 2 " + arg0);
    }

    @When("user searches for a text feature {int}")
    public void userSearchesForATextFeature(int arg0) {
        System.out.println("User searches for a text : Feature 2 " + arg0);
    }

    @Then("user should see the text displayed feature {int}")
    public void userShouldSeeTheTextDisplayedFeature(int arg0) {
        System.out.println("User observes the text display : Feature 2 " + arg0);
    }
}
