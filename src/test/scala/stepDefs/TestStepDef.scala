package stepDefs

import cucumber.api.PendingException
import cucumber.api.scala.{EN, ScalaDsl}

class TestStepDef extends ScalaDsl with EN {

  Given("""^I have navigated to google$"""){ () =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  When("""^I search for "([^"]*)"$"""){ (arg0:String) =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""^the page title should be selenium - Google Search$"""){ () =>
    //// Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

}
