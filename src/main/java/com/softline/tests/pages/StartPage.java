package com.softline.tests.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {


        private static final Logger log = LogManager.getLogger();

        @FindBy(xpath = "//*[@class='needle']")
        private WebElement needle;

        @FindBy(className = "navigator")
        private WebElement linkNavigator;

        public boolean checkingNeedle() {
            try {
                needle.isDisplayed();
                return true;
            } catch (NoSuchElementException e) {
                log.info("'needle' element didn't found");
                return false;
            }
        }

        public NavigatorPage clickLinkNavigator() {
            linkNavigator.click();
            log.info("New page was opened");
            return new NavigatorPage();
        }

    }