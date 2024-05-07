package de.sconto.stepDefinitions;

import de.sconto.pages.HomePage;
import io.cucumber.java.af.En;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static de.sconto.pages.HomePage.baseURL;

public class HomePageSteps {

    HomePage homePage;

    @Given("User is on the Homepage")
    public void HomePageSteps() {

       //    System.setProperty("selenide.browser","Firefox");
           homePage = open(baseURL, HomePage.class);
           getWebDriver().manage().window().maximize();
           homePage.acceptCookies();
    }
}
