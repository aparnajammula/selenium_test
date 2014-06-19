package com.hugeqa.seleniumtests.pages;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ajammula
 * Date: 6/18/14
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class googlesearch {
    /**
    * The constant logger.
    */
    private static final Logger logger = Logger.getLogger(googlesearch.class);


    WebDriver driver = new FirefoxDriver();

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before("@GoogleSearch")
    public void setUp() throws Exception {
        logger.debug("Google Search");
    }

    /**
     * Tear down.
     *
     * @throws java.io.IOException the iO exception
     */
    @After("@GoogleSearch")
    public void tearDown() throws IOException {
        logger.debug("Tear Down Running...");
        driver.quit();
    }


    @Given("^user is on google landing page$")
    public void user_is_on_google_landing_page() throws Throwable {
       driver.get("http://www.google.com");
    }



}



