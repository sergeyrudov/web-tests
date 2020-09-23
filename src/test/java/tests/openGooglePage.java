package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class openGooglePage extends TestBase {

    @Test
    @DisplayName("Navigate to main page")
    void openGooglePage() {
        step("Go to login page", () -> {
            open("https://google.com");
            $(By.name("q")).shouldBe(visible);
        });
    }
}
