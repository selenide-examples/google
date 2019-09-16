package org.selenide.examples.google.temp;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
  @Before
  public void setUp() {
    Configuration.browser = ChromedriverProvider.class.getName();
  }

  @Test
  public void GoogleHome() {
    open("https://google.com");

    GoogleHomePage page = new GoogleHomePage();
    page.clickMe();
  }
}