package com.assigment.StepDefinitions;

import com.assigment.BaseClass;
import com.assigment.BookPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.assigment.BookPage.*;

public class BookStepDefs extends BaseClass {

    @Before
    public void setup(){

        setDriver();
    }
    @After
    public void teardown(){

        closeDriver();
    }
    @Given("launch book page")
    public void openBookPge() {
        navigateToBook();
        throw new PendingException();
    }
    @Given("^the button (.*) is enter$")
    public void addAndEdit(String tool){
        if (tool=="edit"){
            editBook();
        }
        else if (tool=="creat"){
            creatBook();
        }

    }
    @When("^the button (.*) clicked on id (.*)$")
    public void deleteBook(String delete,String id){

        deleteBookA(id);
    }
    @When("user add (.*) to title and add (.*) to year")
    public void addBook(String title, String year){
        addTitle(title);
        addYear(year);
    }
    @Then("user submit result and book show")
    public void submitResult(){
        saveBook();
        openBookPge();
    }
    @Then("^result for <book> id <1> are disapper$")
    public void disapperBook(){

        openBookPge();
    }

}
