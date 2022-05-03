package io.github.bapadua.cucumber.bagextra;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bapadua.cucumber.bagcommons.BagHttpClient;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class BagExtraCucumberStepDefinitions {

    @Autowired
    private BagHttpClient client;

    @Given("^the bag is not empty$")
    public void the_bag_is_not_empty() {
        client.put("something");
        assertThat(client.getContents().isEmpty()).isFalse();
    }

    @When("^I empty the bag$")
    public void empty_the_bag() {
        client.clean();
    }
}
