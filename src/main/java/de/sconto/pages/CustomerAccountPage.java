package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class CustomerAccountPage {

    @FindBy(css = ".titleHeadline")
    WebElement titleHeadline;

    public SelenideElement userName() {
        return $(titleHeadline);
    }
}