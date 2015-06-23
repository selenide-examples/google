package org.selenide.examples.google.selenide_page_object_with_fields.selenide_page_object;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;

public class SearchResultsPage {
  @FindBy(css = "#ires li.g")
  private ElementsCollection results;

  public void checkResultsSize(int expectedSize) {
    results.shouldHave(size(expectedSize));
  }
  
  public void checkResults(String... expectedTexts) {
    results.shouldHave(texts(expectedTexts));
  }
  
  public ElementsCollection getResults() {
    return results;
  }
}
