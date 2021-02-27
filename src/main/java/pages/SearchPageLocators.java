package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SearchPageLocators {
SelenideElement firstRegistration = $(byXpath("//div//button[@id=\"yearFilter\"]/span"));
SelenideElement from = $(byXpath("//div[@class=\"root___1GlEV rootBottomEnd___1HS_K\"]/div/div/div[1]/select"));
SelenideElement from2015FixedFilter = $(byXpath("//div/ul[@class=\"list___1hulU\"]/li[@data-qa-selector-value=\"Ab 2015\"]/button"));
SelenideElement from2015AppliedFilter = $(byXpath(" //div//button[@id=\"yearFilter\"]/span[@class=\"label___2A7vZ\"][contains(text(), 'Ab 2015')]"));
SelenideElement sortByField = $(byXpath("//div//select[@id=\"sortBy\"]"));
}
