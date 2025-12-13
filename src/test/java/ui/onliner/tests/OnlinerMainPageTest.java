package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;
import org.junit.jupiter.api.Tag;

@Epic("Onliner.by E-commerce")
@Feature("Главная страница")
@Story("Базовые элементы интерфейса")
@Owner("Vasili Platonau")
public class OnlinerMainPageTest extends TestBase {

    private final MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Логотип Onliner отображается на главной странице")
    @Description("Проверка видимости основного логотипа сайта")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "Onliner.by", url = "https://www.onliner.by")
    @Tag("smoke")
    void logoIsDisplayedOnMainPage() {
        mainPage.openMainPage()
                .acceptCookies()
                .verifyLogoIsDisplayed();
    }

    @Test
    @DisplayName("Ссылка 'Onlíner Клевер' отображается на главной странице")
    @Description("Проверка что ссылка на рассрочку 'Клевер' присутствует в навигации")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "Onliner.by", url = "https://www.onliner.by")
    @Tag("smoke")
    void cleverLinkIsDisplayedOnMainPage() {
        mainPage.openMainPage()
                .acceptCookies()
                .verifyCleverLinkExists();
    }

    @Test
    @DisplayName("Возрастное ограничение '18+' отображается на главной странице")
    @Description("Проверка что значок возрастного ограничения присутствует")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "Onliner.by", url = "https://www.onliner.by")
    @Tag("smoke")
    void ageRestrictionIsDisplayedOnMainPage() {
        mainPage.openMainPage()
                .acceptCookies()
                .verifyAgeRestrictionIsDisplayed();
    }
}