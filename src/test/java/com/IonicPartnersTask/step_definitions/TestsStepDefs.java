package com.IonicPartnersTask.step_definitions;

import com.IonicPartnersTask.pages.BlogPage;
import com.IonicPartnersTask.utilities.BrowserUtils;
import com.IonicPartnersTask.utilities.ConfigurationReader;
import com.IonicPartnersTask.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestsStepDefs {


    @Given("the user in the main page")
    public void the_user_in_the_main_page() {
        Driver.get().get(ConfigurationReader.get("uri"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(2);


    }

    @When("the user click on the {string} button")
    public void the_user_click_on_the_button(String baseMenu) {
        new BlogPage().menuBar(baseMenu);
        BrowserUtils.waitFor(2);

    }

    @Then("the user verify the blog page is displayed")
    public void theUserVerifyTheBlogPageIsDisplayed() {
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        BrowserUtils.waitFor(3);
    }

    @Then("the user scroll the page down")
    public void the_user_scroll_the_page_down() {
        WebElement footer = Driver.get().findElement(By.id("footer"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].scrollIntoView(true);", footer);


    }

    @Given("the user iis in the main page")
    public void the_user_iis_in_the_main_page() {

    }

    @Then("the user click on the {string} icon")
    public void the_user_click_on_the_icon(String string) {

        BrowserUtils.clickWithJS(Driver.get().findElement(By.cssSelector(".fa.fa-twitter")));


    }


    @Then("the address of the company is displayed")
    public void theAddressOfTheCompanyIsDisplayed() {
        WebElement companyAddress = Driver.get().findElement(By.xpath("//div[@class='logo-work']/p"));
        Assert.assertTrue(companyAddress.isDisplayed());

    }

    @Then("the user verify the twitter page is displayed")
    public void theUserVerifyTheTwitterPageIsDisplayed() {

        Assert.assertTrue(Driver.get().getTitle().contains("Ionic Partners"));
    }
}
