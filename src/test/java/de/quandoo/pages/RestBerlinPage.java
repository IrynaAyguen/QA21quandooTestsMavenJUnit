package de.quandoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RestBerlinPage extends PageBase {

    public RestBerlinPage(WebDriver driver) {
        super(driver);
    }

    private static final String RESTBERLIN_URL = BASE_URL;

    // Web Elements
    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    WebElement acceptAllCookies;

    @FindBy(css = ".cfhRwc")
    WebElement restCount;

    @FindBy(xpath = "//button[contains(.,'Top rated')]")
    WebElement topRatedBTN;

    @FindBy(css = ".jZYVwn:nth-child(1) span:nth-child(1)")
    WebElement filterText;

    //@FindBy(css=".PskrO:nth-child(1)")
    @FindBy(xpath = "//div[@class='ulye33-0 cdvAxr'] / li[1] / label[1]")
    WebElement cuisineFirstItem;

    @FindBy(xpath = "//div[@class='ulye33-0 cdvAxr']  / li[1] //div[1] /span[2]")
    WebElement countOfFirestItem;

    @FindBy(css = ".iTkAfG")
    List<WebElement> filteredList;

    // Methods
    public void goToRestBerlinPage() {
        driver.navigate().to(RESTBERLIN_URL);
    }

    public void acceptCookies() {
        acceptAllCookies.click();
    }

    public String getRestCount() {
        pause(3000);
        return restCount.getText();
    }

    public void clickOnTopRatedButton() {
        topRatedBTN.click();
    }

    public String getFilterText() {
        return filterText.getText();
    }

    public void clickOnFirstItemInCuisine() {
        cuisineFirstItem.click();
        pause(3000);
    }

    public String getTextOfFirstItemInCuisine() {
        return countOfFirestItem.getText();
    }

    public int getCountFirstItemInCuisine(String str) {
        int length = str.length();
        int count = Integer.parseInt(str.substring(1, length - 1));
        return count;
    }

    public int getListSizeInCuisine() {
        int size = filteredList.size();
        return size;
    }
}
