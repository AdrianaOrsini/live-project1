package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomeImpl impl = new HomeImpl();


    @When("I navigate to HomePage")
    public void i_navigate_to_home_page() {
        impl.navigateToHomepage();
    }
    @Then("I should see Homeworks navigation button")
    public void i_should_see_homeworks_navigation_button() {
        Assert.assertEquals("Homework", impl.getPage().HomeworkLink.getText());
    }
    @Then("I should see Meetings links button")
    public void i_should_see_meetings_links_button() {
        Assert.assertEquals("Meeting links", impl.getPage().MeetingsLink.getText());
    }

}
