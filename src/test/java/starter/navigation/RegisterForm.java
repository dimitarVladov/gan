package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterForm extends PageObject {

    public void selectTitle(String title) {
        selectFromDropdown(find("#title"), title);
    }

    public void addFirstName(String firstName) {
        find("#forename").type(firstName);
    }

    public void addLastName(String lastName) {
        evaluateJavascript("arguments[0].setAttribute('value', '"+lastName+"')", find(By.cssSelector("input[name='map(lastName)']")));
    }

    public void acceptTermAndConditions() {
        setCheckbox(find(By.cssSelector("input[name='map(terms)']")), true);
    }

    public void submit() {
        find("#form").click();
    }

    public String getDobValidationMessage() {
        return find(By.cssSelector("label[for='dob']")).getText();
    }
}
