package ui.onliner.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MarketplacePage {

    private final SelenideElement marketplaceTitle = $("h1.m-title-i");

    @Step("Проверить заголовок 'Барахолка' на странице")
    public void verifyMarketplaceTitle() {
        marketplaceTitle.shouldBe(visible).shouldHave(text("Барахолка"));
    }
}