package org.selenide.examples.google.selenide_straightforward;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

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
