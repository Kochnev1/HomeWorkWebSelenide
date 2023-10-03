package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryTest {

    @Test
    void shouldTest() {
        open("http://localhost:9999");
        $$("[data-test-id=notification]");
        $("[data-test-id=city] input").setValue("Екатеринбург");
        $("[data-test-id=date] input").setValue("11.10.2023");
        $("[data-test-id=name] input").setValue("Геннадий Ветров");
        $("[data-test-id=phone] input").setValue("+79090091919");
        $("[data-test-id=agreement]").click();
        $("button").click();
        // $(withText("Встреча успешно забронирована")).shouldBe(visible);


    }

}
