package com.softline.tests;

import com.softline.tests.pages.NavigatorPage;
import com.softline.tests.pages.StartPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SoftLineTest extends BaseTest {

    private StartPage startPage;

    @Test
    public void testCheckNeedle() {
        startPage = new StartPage();
        assertTrue(startPage.checkingNeedle());
    }

    @Test
    public void testLink1() {
        startPage = new StartPage();
        String link1 = startPage.clickLinkNavigator().getNamePage1();
        String titleLink1 = startPage.clickLinkNavigator().openLink1Page().getTitle();
        assertEquals(link1, titleLink1, " The title doesn't equal the name Link1");
    }

    @Test
    public void testLink2() {
        startPage = new StartPage();
        String link2 = startPage.clickLinkNavigator().getNamePage2();
        String titleLink2 = startPage.clickLinkNavigator().openLink2Page().getTitle();
        assertEquals(link2, titleLink2, " The title doesn't equal the name Link1");
    }

    @Test
    public void testLink3() {
        startPage = new StartPage();
        String link3 = startPage.clickLinkNavigator().getNamePage3();
        String titleLink3 = startPage.clickLinkNavigator().openLink3Page().getTitle();
        assertEquals(link3, titleLink3, " The title doesn't equal the name Link1");
    }

}
