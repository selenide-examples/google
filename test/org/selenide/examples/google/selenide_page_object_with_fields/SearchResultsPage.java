package org.selenide.examples.google.selenide_page_object_with_fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
  private final ElementsCollection results = $$(".results .result");

  public SelenideElement getResult(int index) {
    return results.get(index);
  }
  
  public ElementsCollection getResults() {
    return results;
  }
}
