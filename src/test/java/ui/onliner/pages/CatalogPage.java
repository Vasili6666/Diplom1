package ui.onliner.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class CatalogPage {


    private final String FIRST_LAPTOP_LINK_SELECTOR = ".catalog-form__offers-flex a[href*='/notebook/']";
    private final SelenideElement firstLaptopLink = $$(FIRST_LAPTOP_LINK_SELECTOR).first();
    private final String ASUS_CHECKBOX_XPATH = "//li[contains(@class, 'catalog-form__checkbox-item')]//span[text()='ASUS']";
    private final SelenideElement asusCheckbox = $x(ASUS_CHECKBOX_XPATH);
    private final String PRIME_CHECKBOX_XPATH = "//label[contains(@class, 'catalog-form__bonus-item_primary')]//div[contains(@class, 'catalog-form__bonus-prime')]/parent::label";
    private final SelenideElement primeCheckbox = $x(PRIME_CHECKBOX_XPATH);


    @Step("Выбрать первый ноутбук в списке")
    public void selectFirstLaptop() {
        firstLaptopLink.click();
        sleep(5000);
    }

    @Step("Выбрать производителя 'ASUS' в фильтрах")
    public CatalogPage selectManufacturerAsus() {
        asusCheckbox.scrollIntoView(true).click();
        sleep(3000);
        return this;
    }

    @Step("Выбрать услугу 'Prime' в фильтрах")
    public CatalogPage selectPrimeService() {
        primeCheckbox.scrollIntoView(true).click();
        sleep(3000);
        return this;
    }
}