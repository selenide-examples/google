package org.selenide.examples.google.selenide_straightforward;

import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
  @Rule
  public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

  @Test
  public void search_selenide_in_google() {
    open("https://google.com/ncr");
    $(By.name("q")).val("selenide").pressEnter();
    $$("#res .g").shouldHave(sizeGreaterThan(1));
    $("#res .g").shouldBe(visible).shouldHave(
        text("Selenide: concise UI tests in Java"),
        text("selenide.org"));
  }
}
