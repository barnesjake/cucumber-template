package automation.stepdefinitions

import org.openqa.selenium.{By, Keys}

class TestStepDef extends BaseStep {

  Given("""^I have navigated to google$""") { () =>
    // Write code here that turns the phrase above into concrete actions
    val url: String = "https://www.google.com"
    webDriver.navigate().to(url)
  }

  When("""^I search for '(.*)'$""") { arg0: String =>
    // Write code here that turns the phrase above into concrete actions
    val xpath: String = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"
    webDriver.findElement(By.xpath(xpath)).sendKeys("scala")
    webDriver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER)
  }

  Then("""^the page title should be scala - Google Search$""") { () =>
    webDriver.getTitle should be("scala - Google Search")
  }

}
