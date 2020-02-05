package automation.stepdefinitions

import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.Matchers

trait BaseStep extends ScalaDsl with EN with Matchers {

  implicit val webDriver: WebDriver = new ChromeDriver()

  After(x => webDriver.quit())

  def sendText(locator: String, text: String): Unit = webDriver.findElement(By.xpath(locator)).sendKeys(text)

}