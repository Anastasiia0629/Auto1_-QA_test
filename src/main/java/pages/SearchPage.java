package pages;

import io.qameta.allure.Step;

import static common.steps.CommonSteps.assertEqualsWithWait;


public class SearchPage {
    SearchPageLocators searchPageLocators = new SearchPageLocators();

    @Step
    public void clickFirstRegistrationButton() {
        searchPageLocators.firstRegistration.click();

    }

    @Step
    public void selectFrom2015() {
        searchPageLocators.from.selectOption("2015");
    }


    @Step
    public void closeFirstRegistrationButton() {
        searchPageLocators.firstRegistration.click();
    }


    @Step
    public void verifyAppliedFilterFrom2015(String expectedName) {
        assertEqualsWithWait(searchPageLocators.from2015AppliedFilter, expectedName, 10);
    }

    @Step
    public void verifyAppliedFilterFrom2015Fixed(String expectedName) {
        assertEqualsWithWait(searchPageLocators.from2015FixedFilter, expectedName, 10);
    }

    @Step
    public void clickSortByField() {
        searchPageLocators.sortByField.click();
    }

    @Step
    public void selectPriceDesc() {
        searchPageLocators.sortByField.selectOption("Höchster Preis");
    }

    @Step
    public void verifyAppliedSortingByPriceDesc(String expectedName) {
        assertEqualsWithWait(searchPageLocators.sortByField, expectedName, 10);
    }




}
