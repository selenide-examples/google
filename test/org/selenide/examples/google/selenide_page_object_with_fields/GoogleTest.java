package org.selenide.examples.google.selenide_page_object_with_fields;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
  @Test
  public void userCanSearch() {
    GooglePage page = open("http://google.com/ncr", GooglePage.class);
    SearchResultsPage results = page.searchFor("selenide");
    
    results.checkResultsSize(10);
    results.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
  }
}
