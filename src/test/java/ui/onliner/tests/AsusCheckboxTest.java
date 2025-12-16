package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;
import ui.onliner.pages.CatalogPage;

@Epic("Onliner.by E-commerce")
@Feature("Фильтрация товаров")
@Story("Фильтр по производителю ASUS")
@Owner("Vasili Platonau")
public class AsusCheckboxTest extends TestBase {

    private final MainPage mainPage = new MainPage();
    private final CatalogPage catalogPage = new CatalogPage();

    @Test
    @DisplayName("Проверка фильтрации ноутбуков по производителю ASUS")
    @Description("Выбор чекбокса ASUS и проверка наличия товаров ASUS")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "Onliner.by", url = "https://www.onliner.by")
    void asusFilterTest() {
        mainPage.openMainPage()
                .acceptCookies()
                .goToLaptopsSection();

        catalogPage.selectManufacturerAsus();
        catalogPage.verifyProductsContainAsus();
    }
}