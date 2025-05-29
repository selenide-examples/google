package org.selenide.examples.google.selenide_page_object_with_assertions;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
  @Test
  public void userCanSearch() {
    open("https://duckduckgo.com");
    new GooglePage().searchFor("selenide java");

    SearchResultsPage results = new SearchResultsPage();
    results.checkResultsSizeIsAtLeast(1);
    results.checkResultHasTest(0, "Selenide: concise UI tests in Java");
  }
}
