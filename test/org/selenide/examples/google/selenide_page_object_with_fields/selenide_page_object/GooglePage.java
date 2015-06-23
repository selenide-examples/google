package org.selenide.examples.google.selenide_page_object_with_fields.selenide_page_object;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
  private SelenideElement q;
  
  public SearchResultsPage searchFor(String text) {
    q.val(text).pressEnter();
    return page(SearchResultsPage.class);
  }
}
