package com.softline.tests.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigatorPage extends BasePage {
    private static final Logger log = LogManager.getLogger();

    @FindBy(xpath = "//*[@href='/link1/']")
    private WebElement link1;

    @FindBy(xpath = "//*[@href='/link2/']")
    private WebElement link2;

    @FindBy(xpath = "//*[@href='/link3/']")
    private WebElement link3;


    public String getNamePage1() {
        String nameLink1 = link1.getText();
        log.info("Name link is " + link1.getText());
        return nameLink1;
    }

    public Link1Page openLink1Page() {
        link1.click();
        log.info( link1.getText() + " was opened");
        return new Link1Page();
    }

    public String getNamePage2() {
        String nameLink2 = link2.getText();
        log.info("Name link is " + link2.getText());
        return nameLink2;
    }

    public Link2Page openLink2Page() {
        link2.click();
        log.info("Name link is " + link2.getText() + " and new page was opened");
        return new Link2Page();
    }

    public String getNamePage3() {
        String nameLink1 = link3.getText();
        log.info("Name link is " + link3.getText());
        return nameLink1;
    }
    public Link3Page openLink3Page() {
        link3.click();
        log.info("Name link is " + link3.getText() + " and new page was opened");
        return new Link3Page();
    }



}
