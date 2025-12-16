package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;
import ui.onliner.pages.CatalogPage;

@Epic("Onliner.by E-commerce")
@Feature("Фильтрация товаров")
@Story("Фильтр по услуге Prime")
@Tag("smoke")
@Owner("Ваше Имя")
public class PrimeCheckboxTest extends TestBase {

    private final MainPage mainPage = new MainPage();
    private final CatalogPage catalogPage = new CatalogPage();

    @Test
    @DisplayName("Проверка фильтрации товаров по услуге Prime")
    @Description("Выбор чекбокса Prime и проверка наличия логотипа Prime у первого товара")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "Onliner.by", url = "https://www.onliner.by")
    void primeFilterTest() {
        mainPage.openMainPage()
                .acceptCookies()
                .goToLaptopsSection();

        catalogPage.selectPrimeService();
        catalogPage.verifyFirstProductHasPrimeLogo();
    }
}