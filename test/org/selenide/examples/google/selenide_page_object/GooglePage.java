package org.selenide.examples.google.selenide_page_object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
  public void searchFor(String text) {
    $(By.name("q")).val(text).pressEnter();
  }
}
