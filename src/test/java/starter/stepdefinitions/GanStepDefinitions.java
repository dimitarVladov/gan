package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.navigation.HomePage;
import starter.navigation.RegisterForm;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GanStepDefinitions {

    HomePage ganHome;
    RegisterForm ganRegisterForm;

    @Given("web user navigates to gan home page")
    public void webUserNavigatesTo() {
        ganHome.load();
    }

    @When("user selects option join now")
    public void userSelectsOptionJoinNow() {
        ganHome.selectJoinNow();
    }

    @And("user fills up title {string}, first name {string} & last name {string}")
    public void userFillsUpTitleFirstNameLastName(String title, String firstName, String lastName) {
        ganRegisterForm.selectTitle(title);
        ganRegisterForm.addFirstName(firstName);
        ganRegisterForm.addLastName(lastName);
    }

    @And("user accepts terms & conditions for register form")
    public void userAcceptsTermsConditionsForRegisterForm() {
        ganRegisterForm.acceptTermAndConditions();
    }

    @And("user submits register form")
    public void userSubmitsRegisterForm() {
        ganRegisterForm.submit();
    }

    @Then("validation message with text {string} appears under the date of birth box")
    public void validationMessageWithTextAppearsUnderTheDateOfBirthBox(String expectedMessage) {
        assertThat(expectedMessage, equalTo(ganRegisterForm.getDobValidationMessage()));
    }
}
