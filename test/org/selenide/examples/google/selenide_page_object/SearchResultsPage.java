package org.selenide.examples.google.selenide_page_object;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
  public ElementsCollection getResults() {
    return $$("#ires .g");
  }
}
