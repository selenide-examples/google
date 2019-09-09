package org.selenide.examples.google.classic_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class GooglePage {
  private WebElement q;
  private final WebDriver webdriver;

  public GooglePage(WebDriver webdriver) {
    this.webdriver = webdriver;
  }

  public SearchResultsPage searchFor(String text) {
    q.sendKeys(text);
    q.submit();
    new WebDriverWait(webdriver, 8).until(visibilityOfElementLocated(By.cssSelector("#res .g")));
    return PageFactory.initElements(webdriver, SearchResultsPage.class);
  }
}
