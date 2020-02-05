package automation.stepdefinitions

import org.openqa.selenium.By

class TestStepDef extends BaseStep {

  Given("""^I have navigated to google$""") { () =>
    // Write code here that turns the phrase above into concrete actions
  }

  When("""^I search for '(.*)'$""") { arg0: String =>
    // Write code here that turns the phrase above into concrete actions
  }

  Then("""^the page title should be scala - Google Search$""") { () =>

  }

}
