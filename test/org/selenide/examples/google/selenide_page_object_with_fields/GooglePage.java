package org.selenide.examples.google.selenide_page_object_with_fields;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
  private SelenideElement q;
  
  public SearchResultsPage searchFor(String text) {
    q.val(text).pressEnter();
    return page(SearchResultsPage.class);
  }
}
