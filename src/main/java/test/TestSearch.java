package test;

import common.test_data.Links;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.open;

public class TestSearch extends BasePage {

    @BeforeClass
    public void openSearchPage() {
        open(Links.Auto1.getSearchPage());
    }


    @Test
    public void applyFrom2015() {
        searchPage.clickFirstRegistrationButton();
        searchPage.selectFrom2015();
        searchPage.closeFirstRegistrationButton();
        searchPage.verifyAppliedFilterFrom2015("Ab 2015");
        searchPage.verifyAppliedFilterFrom2015Fixed("Erstzulassung: Ab 2015");
    }

    @Test
    public void sortByPriceDesc() {
        searchPage.clickSortByField();
        searchPage.selectPriceDesc();
        searchPage.verifyAppliedSortingByPriceDesc("Höchster Preis");
    }

}
