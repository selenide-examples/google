package org.selenide.examples.google.selenide_straightforward;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@ExtendWith(TextReportExtension.class)
public class GoogleTest {
  @Test
  public void search_selenide_in_google() {
    open("https://duckduckgo.com");
    $(By.name("q")).val("selenide java").pressEnter();
    $$("[data-testid=\"result\"]").shouldHave(sizeGreaterThan(1));
    $("[data-testid=\"result\"]").shouldBe(visible).shouldHave(
        text("Selenide: concise UI tests in Java"),
        text("selenide.org"));
  }
}
