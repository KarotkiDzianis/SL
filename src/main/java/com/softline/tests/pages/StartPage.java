package com.softline.tests.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {


        private static final Logger log = LogManager.getLogger();

        @FindBy(xpath = "//div[@class='needle']")
        private WebElement needle;

        @FindBy(xpath = "//a[@class='navigator']" )
        private WebElement linkNavigator;

    /**
     * This method checks availability element 'needle'.
     */
        public boolean checkingNeedle() {
            try {
                needle.isDisplayed();
                return true;
            } catch (NoSuchElementException e) {
                log.info("'needle' element didn't found");
                return false;
            }
        }

    /**
     * This method redirects to the NavigatorPage.
     */
        public NavigatorPage clickLinkNavigator() {
            linkNavigator.click();
            log.info("New page was opened");
            return new NavigatorPage();
        }

    }