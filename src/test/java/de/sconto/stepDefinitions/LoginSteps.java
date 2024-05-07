package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.CustomerAccountPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;

public class LoginSteps {

    HomePage homePage;
    LoginPage loginPage;
    CustomerAccountPage customerAccount;

    @When("User clicks on the Login icon")
    public void click_on_Login_icon() {
        homePage = Selenide.page(HomePage.class);
        loginPage = homePage.clickLoginIcon();
    }

    @Then("User verifies Login form")
    public void verify_Login_icon() {
        loginPage.loginPageHeader().should(exist);
        loginPage.loginPageHeader().shouldHave(text("Anmelden"));
    }

    @When("User enters valid credentials")
    public void enter_valid_user_credentials() {
        loginPage.validLoginInput();
    }

    @When("User clicks on Login button")
    public void click_on_Login_button() {
        loginPage.clickLoginButton();
    }

    @Then("User verifies User icon")
    public void homePage() {
        homePage.accountStatus().should(exist);
    }

    @When("User clicks on User icon")
    public void click_on_User_icon() {
        homePage.clickLoginIcon();
    }

    @Then("User verifies his name")
    public void verify_User_name() {
        customerAccount = Selenide.page(CustomerAccountPage.class);
        customerAccount.userName().shouldHave(text("Manuel Neuer"));
    }

}
