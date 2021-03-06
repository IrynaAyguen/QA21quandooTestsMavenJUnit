package de.quandoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;

    /* Constructor injecting the WebDriver interface
     * @param webDriver*/
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //BASE URL
    public static String BASE_URL = "https://www.quandoo.de/en/berlin";

    // general methods
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
