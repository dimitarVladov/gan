package starter.navigation;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {


    public void load() {
        getDriver().get("https://moneygaming.qa.gameaccount.com/");
    }
    public void selectJoinNow() {
        find(".newUser.green").click();
    }
}