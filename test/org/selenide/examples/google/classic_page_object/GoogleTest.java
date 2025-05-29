package org.selenide.examples.google.classic_page_object;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest {
  private WebDriver driver;

  @BeforeEach
  public void setUp() {
    String currentBrowser = System.getProperty("selenide.browser", "firefox");
    if ("chrome".equals(currentBrowser)) {
      driver = new ChromeDriver(chromeOptions());
    } else if ("firefox".equals(currentBrowser)) {
      driver = new FirefoxDriver(firefoxOptions());
    } else if ("safari".equals(currentBrowser)) {
      driver = new SafariDriver();
    } else if ("edge".equals(currentBrowser)) {
      driver = new EdgeDriver();
    } else if ("ie".equals(currentBrowser)) {
      driver = new InternetExplorerDriver();
    }
  }

  @AfterEach
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void userCanSearch() {
    driver.get("https://www.duckduckgo.com");
    GooglePage page = PageFactory.initElements(driver, GooglePage.class);
    SearchResultsPage results = page.searchFor("Selenide java");
    assertThat(results.getResults().get(0).getText())
            .isNotNull()
            .contains("Selenide: concise UI tests in Java");
  }

  private static ChromeOptions chromeOptions() {
    return isHeadless() ? new ChromeOptions().addArguments("--headless=new") : new ChromeOptions();
  }

  private static FirefoxOptions firefoxOptions() {
    return isHeadless() ? new FirefoxOptions().addArguments("-headless") : new FirefoxOptions();
  }

  private static boolean isHeadless() {
    return "true".equalsIgnoreCase(System.getProperty("selenide.headless"));
  }
}
