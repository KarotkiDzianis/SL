package com.softline.tests;

import com.softline.tests.webdriver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private final static String BASE_URL = "http://'/'/";
    private final static Logger log = LogManager.getLogger();

    @BeforeMethod
    public void setUp() {
        log.debug("Create driver");
        DriverManager.getDriver().get(BASE_URL);
        log.info("Open URL: " + BASE_URL);
    }

    @AfterMethod
    public void closeDriver() {
        DriverManager.closeDriver();
        log.debug("Close driver");
    }
}