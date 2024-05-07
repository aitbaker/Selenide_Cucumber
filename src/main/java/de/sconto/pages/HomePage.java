package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");
    @FindBy(xpath = "//*[@data-accept-action='all']")
    WebElement acceptBtn;
    @FindBy(css = ".headerElement--login")
    WebElement loginIcon;

    public HomePage acceptCookies() {
        if ($(acceptBtn).exists()) {
            $(acceptBtn).click();
        }
        return Selenide.page(this);
    }

    public LoginPage clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }

    @FindBy(css = ".headerElement__status--login")
    WebElement loginStatus;

    public SelenideElement accountStatus() {
        return $(loginStatus);
    }
}
