package io.github.bapadua.cucumber.bagcommons;


import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class BagCommonStepDefinitions {

    @Autowired
    private BagHttpClient client;

    @Given("^the bag is empty$")
    public void the_bag_is_empty() {
        client.clean();
        assertThat(client.getContents().isEmpty()).isTrue();
    }
}
