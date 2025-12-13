package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;
import ui.onliner.pages.CatalogPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Onliner.by E-commerce")
@Feature("Фильтрация товаров")
@Story("Фильтр по услуге Prime")
@Tag("ui")
@Owner("Ваше Имя")
public class PrimeCheckboxTest extends TestBase {

    private final MainPage mainPage = new MainPage();
    private final CatalogPage catalogPage = new CatalogPage();

    // Локаторы
    private final String FIRST_TICKET_ITEM_SELECTOR = ".catalog-form__ticket-item";
    private final String PRIME_LOGO_SELECTOR = ".catalog-form__popover-trigger_prime";

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


        boolean firstItemHasPrimeLogo = $(FIRST_TICKET_ITEM_SELECTOR)
                .$(PRIME_LOGO_SELECTOR)
                .exists();

        assertTrue(firstItemHasPrimeLogo,
                "После фильтрации Prime хотя бы первый товар должен иметь логотип Prime");


        boolean anyItemHasPrimeLogo = $$(FIRST_TICKET_ITEM_SELECTOR)
                .stream()
                .findFirst()
                .map(element -> element.$(PRIME_LOGO_SELECTOR).exists())
                .orElse(false);

        assertTrue(anyItemHasPrimeLogo,
                "После фильтрации Prime должен быть хотя бы один товар с логотипом Prime");
    }
}