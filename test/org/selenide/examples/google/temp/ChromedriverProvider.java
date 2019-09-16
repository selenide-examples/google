package org.selenide.examples.google.temp;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromedriverProvider implements WebDriverProvider {

  @Override
  public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
    DesiredCapabilities capabilities = new DesiredCapabilities(desiredCapabilities);
    capabilities.setBrowserName("chrome");
    capabilities.setVersion("75.0");
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", false);

//    return new RemoteWebDriver(
//        URI.create("http://127.0.0.1:4444/wd/hub").toURL(),
//        capabilities
//    );
    return new ChromeDriver(capabilities);
  }
}