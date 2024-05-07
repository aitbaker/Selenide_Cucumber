package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import de.sconto.util.PropertiesLoader;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");
    @FindBy(id = "loginEmail")
    WebElement emailInput;
    @FindBy(id = "loginPassword")
    WebElement passwordInput;

    public void validLoginInput() {
        $(emailInput).val(validEmail);
        $(passwordInput).val(validPassword);
    }

    @FindBy(id = "login-submit")
    WebElement loginButton;

    public void clickLoginButton() {
        $(loginButton).click();
    }

    @FindBy(css = ".existingAccount__headline")
    WebElement loginHeader;

    public SelenideElement loginPageHeader() {
        return $(loginHeader);
    }

    public void invalidPasswordInput(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();

        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        $(emailInput).val(email);
        $(passwordInput).val(password);
    }

    @FindBy(id = "loginEmail-error")
    WebElement errorMessage;

    public SelenideElement error() {
       return  $(errorMessage);
    }

    @FindBy(id = "loginPassword-error")
    WebElement passwordErrorMessage;

    public SelenideElement psvErrorMessage() {
        return $(passwordErrorMessage);
    }

}
