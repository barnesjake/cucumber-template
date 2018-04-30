package hmrc.pages
import hmrc.stepDefs.Steps
import org.scalatest.selenium.WebBrowser
// contains all methods/parameters that are generic and used by more than one page
trait WebPage extends Steps with WebBrowser with org.scalatest.selenium.Page {

}
