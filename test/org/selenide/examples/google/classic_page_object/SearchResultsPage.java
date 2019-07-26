package org.selenide.examples.google.classic_page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
  @FindBy(css = "#res .g")
  private List<WebElement> results;

  public List<WebElement> getResults() {
    return results;
  }
}
