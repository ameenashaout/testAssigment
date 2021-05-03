package com.learning.atypon.spring.mvc.tests;

import io.cucumber.java8.En;
import io.cucumber.java8.PendingException;
import io.cucumber.java8.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.lang.annotation.Annotation;

public class Home implements En {

    public Home(){
      Given("launch home page",() ->{
        throw new PendingException("navegate not yet");
      });
      System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver drive= new ChromeDriver();
        drive.get("http://localhost:8080");
        drive.close();
      When("the button {string} entered",(String result)->{
          throw new PendingException("navegate not yet");
      });
      Then("result for {string} are show",(String result)->{
          throw new PendingException("navegate not yet");
      });

    }



}
