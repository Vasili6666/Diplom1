package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.*;


@Epic("Onliner.by E-commerce")
@Feature("Корзина покупок")
@Story("Добавление и удаление товаров из корзины")

public class AddAndDeleteToCartTest extends TestBase {

    private String laptopName = "";
    private final MainPage mainPage = new MainPage();
    private final CatalogPage catalogPage = new CatalogPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();

    @Test
    @DisplayName("Добавление и удаление ноутбука из корзины")
    @Description("Тест проверяет полный цикл: выбор ноутбука, добавление в корзину и удаление")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Vasili Platonau")
    @Link(name = "Onliner.by", url = "https://www.onliner.by")
    void buyAndRemoveLaptopFromCart() {
        mainPage.openMainPage();
        mainPage.acceptCookies();
        mainPage.goToLaptopsSection();

        catalogPage.selectFirstLaptop();

        laptopName = productPage.getProductTitle();
        Allure.addAttachment("Название ноутбука", "text/plain", laptopName);

        productPage.goToPrices();
        productPage.addToCartFromFirstSeller();

        productPage.goToCart();
        cartPage.verifyProductAdded();
        cartPage.removeProduct();
        cartPage.verifyProductRemoved();

        Allure.addAttachment("Результат теста", "text/plain",
                "✅ ТЕСТ ПРОЙДЕН! Ноутбук '" + laptopName + "' успешно добавлен и удалён из корзины!");
    }
}