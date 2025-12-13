package ui.onliner.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.onliner.pages.MainPage;
import ui.onliner.pages.CatalogPage;

import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;

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


        boolean foundAsus = $$(".catalog-form__link_nodecor")
                .stream()
                .anyMatch(element ->
                        element.getText().toLowerCase().contains("asus")
                );

        assertTrue(foundAsus, "После фильтрации ASUS должен быть хотя бы один товар с 'asus' в названии");
    }
}