package ui.onliner.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {


    private final SelenideElement catalogLink = $("a[href='https://catalog.onliner.by/notebook']");
    private final SelenideElement acceptCookiesButton = $(byText("Принимаю"));
    private final SelenideElement logoElement = $(".onliner_logo");
    private final SelenideElement cleverLink = $(".b-top-navigation-clover");
    private final SelenideElement ageRestriction = $(".b-top-navigation-age");
    private final SelenideElement marketplaceButton = $("a.b-main-navigation__link[href='https://baraholka.onliner.by/']");
    private final SelenideElement marketplaceTitle = $("h1.m-title-i");



    @Step("Открыть главную страницу Onliner.by")
    public MainPage openMainPage() {
        open("/");
        sleep(3000);
        return this;
    }

    @Step("Принять cookies если отображаются")
    public MainPage acceptCookies() {
        sleep(3000);

        // Точное название кнопки
        if ($(byText("Принять все cookie")).exists()) {
            $(byText("Принять все cookie")).click();
            System.out.println("✅ Приняли куки: 'Принять все cookie'");
        }

        sleep(1000); // Ждем после клика
        return this;
    }

    @Step("Перейти в раздел 'Барахолка'")
    public void goToMarketplace() {

        marketplaceButton
                .shouldBe(visible, enabled)
                .scrollIntoView(true)
                .click();

        sleep(3000);
    }

    @Step("Проверить заголовок 'Барахолка' на странице")
    public void verifyMarketplaceTitle() {
        marketplaceTitle.shouldHave(text("Барахолка"));
    }

    @Step("Перейти и проверить раздел 'Барахолка'")
    public MainPage goAndVerifyMarketplace() {
        goToMarketplace();
        verifyMarketplaceTitle();
        return this;
    }

    @Step("Перейти в раздел 'Ноутбуки'")
    public void goToLaptopsSection() {
        catalogLink.click();
        sleep(5000);
    }

    @Step("Проверить что логотип Onliner отображается на странице")
    public MainPage verifyLogoIsDisplayed() {
        logoElement.shouldBe(visible);
        return this;
    }

    @Step("Проверить наличие ссылки 'Onlíner Клевер' на странице")
    public MainPage verifyCleverLinkExists() {
        cleverLink.shouldBe(visible);
        return this;
    }

    @Step("Проверить что возрастное ограничение '18+' отображается на странице")
    public MainPage verifyAgeRestrictionIsDisplayed() {
        ageRestriction.shouldBe(visible);
        return this;
    }
}