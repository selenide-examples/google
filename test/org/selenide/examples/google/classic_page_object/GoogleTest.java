package org.selenide.examples.google.classic_page_object;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class GoogleTest {
  WebDriver driver;

  @Before
  public void setUp() {
    driver = "chrome".equals(System.getProperty("selenide.browser")) ? 
        new ChromeDriver() : new FirefoxDriver();
  }

  @After
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void userCanSearch() {
    driver.get("http://www.google.com/");
    GooglePage page = PageFactory.initElements(driver, GooglePage.class);
    SearchResultsPage results = page.searchFor("Selenide");
    assertTrue(results.getResults().get(0).getText().startsWith("Selenide: concise UI tests in Java"));
  }
}
