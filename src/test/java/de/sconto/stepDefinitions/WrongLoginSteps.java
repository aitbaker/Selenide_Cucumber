package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;

public class WrongLoginSteps {

    LoginPage loginPage;

    @When("User enters wrong data:")
    public void insert_user_credentials(DataTable table) {
        loginPage = Selenide.page(LoginPage.class);
        loginPage.invalidPasswordInput(table);
    }

    @Then("User verifies error message")
    public void verify_error_message() {
        loginPage.error().shouldHave(text("Benutzername nicht gefunden oder Passwort falsch."));
    }

    @Then("I see passwordError message")
    public void password_Error() {
        loginPage.psvErrorMessage();
    }
}


