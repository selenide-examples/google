package org.selenide.examples.google.selenide_page_object_with_fields;

import com.codeborne.selenide.*;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
  private ElementsCollection results = $$("#res .g");

  public SelenideElement getResult(int index) {
    return results.get(index);
  }
  
  public ElementsCollection getResults() {
    return results;
  }
}
