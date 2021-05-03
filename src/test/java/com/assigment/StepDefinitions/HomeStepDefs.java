package com.assigment.StepDefinitions;

import com.assigment.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeStepDefs extends BaseClass {
    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
        closeDriver();
    }

    @Given("launch home page")
    public void openApplication() {
        navigateToHome();
        throw new PendingException();
    }


    @When("^the button (.*) entered$")
    public void clickButton(String name){

        if (name=="home")
            homeButton();
        else if (name=="search")
            searchButton();
        else if (name=="author")
            authorsButton();
        throw new PendingException();
    }
    @When("^the phrase (.*) added in text area$")
    public void addText(String text){
        addTextS(text);
        throw new PendingException();

    }

    @Then("^result for (.*) are show$")
    public void showResult(String name){
        //  showResult();
    }

}

