package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;
import ui.onliner.pages.MarketplacePage;

@Epic("Onliner.by E-commerce")
@Feature("Навигация по сайту")
@Story("Переход в раздел Барахолка")
@Owner("Vasili Platonau")
@Tag("smoke")
public class MarketplaceTest extends TestBase {

    private final MainPage mainPage = new MainPage();
    private final MarketplacePage marketplacePage = new MarketplacePage();

    @Test
    @DisplayName("Проверка открытия раздела 'Барахолка'")
    @Severity(SeverityLevel.NORMAL)
    void marketplaceSimpleTest() {
        mainPage.openMainPage()
                .acceptCookies()
                .goToMarketplace();

        marketplacePage.verifyMarketplaceTitle();
    }
}