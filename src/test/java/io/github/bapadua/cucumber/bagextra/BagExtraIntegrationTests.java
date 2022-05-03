package io.github.bapadua.cucumber.bagextra;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagextras",
plugin = {"pretty", "html:target/cucumber/bagextras"},
extraGlue = "io.github.bapadua.cucumber.bagcommons")
public class BagExtraIntegrationTests {
}
