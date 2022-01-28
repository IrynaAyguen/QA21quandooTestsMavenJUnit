package de.quandoo.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UI test for search filter https://www.quandoo.de/en/berlin
 */
public class FilterTest extends TestBase {

    @Test
    public void TaskTest() {
        //open  Restaurants in Berlin page
        restBerlinPage.goToRestBerlinPage();
        //accept cookies
        restBerlinPage.acceptCookies();
        //save total restaurants number to variable
        String restCountBefore = restBerlinPage.getRestCount();
        //click filter Top rated
        restBerlinPage.clickOnTopRatedButton();
        //assert total number of restaurants changed
        String restCountAfter = restBerlinPage.getRestCount();
        assertNotEquals(restCountBefore, restCountAfter);
        assertTrue(restBerlinPage.getFilterText().contains("Review score: "));
        // click on first item in Cuisine filter
        restBerlinPage.clickOnFirstItemInCuisine();
        //assert correct number of displayed restaurants
        String firstItemText = restBerlinPage.getTextOfFirstItemInCuisine();
        int countFirstItemInCuisine = restBerlinPage.getCountFirstItemInCuisine(firstItemText);
        int listSize = restBerlinPage.getListSizeInCuisine();
        assertEquals(countFirstItemInCuisine, listSize);

    }
}
