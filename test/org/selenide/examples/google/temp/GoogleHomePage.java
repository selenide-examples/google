package org.selenide.examples.google.temp;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleHomePage {
  public void clickMe(){
    $(By.linkText("Gmail")).click();
  }
}