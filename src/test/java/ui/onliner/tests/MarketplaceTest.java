package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;

@Epic("Onliner.by E-commerce")
@Feature("Навигация по сайту")
@Story("Переход в раздел Барахолка")
@Owner("Vasili Platonau")
@Tag("smoke")
public class MarketplaceTest extends TestBase {


    private final MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка раздела 'Барахолка'")
    @Severity(SeverityLevel.NORMAL)
    void marketplaceSimpleTest() {
        mainPage.openMainPage()
                .acceptCookies()
                .goAndVerifyMarketplace();

    }
}