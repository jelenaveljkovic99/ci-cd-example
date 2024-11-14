package cucumber_example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    String input;
    int actual;
    @Given("I enter the text {string}")
    public void iEnterTheText(String string) {
        input = string;
    }

    @When("I test given text for vowels count")
    public void iTestGivenTextForVowelsCount() {
        actual = VowelsCounter.count(input);
    }

    @Then("I should get result {int}")
    public void iShouldGetResult(Integer expected) {
        if(actual != expected) {
            throw new AssertionError("Actual not equals expected.");
        }
    }
}
