package io.github.bapadua.cucumber.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "html:target/cucumber/bagbasics"},
        extraGlue = "io.github.bapadua.cucumber.bagcommons")
public class BagCucumberIntegrationTests {
}
