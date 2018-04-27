name := "cucumber_test_project"

version := "0.0.1"

scalaVersion := "2.12.5"
val ScalatestVersion = "3.0.4"
val CucumberVersion = "1.2.5"
val SeleniumVersion = "3.7.1"
credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % ScalatestVersion % "test",
  "org.seleniumhq.selenium" % "selenium-java" % SeleniumVersion % "test",
  "org.pegdown" % "pegdown" % "1.6.0" % "test",
  "com.google.guava" % "guava" % "23.0",
  "info.cukes" % "cucumber-junit" % CucumberVersion % "test",
  "info.cukes" % "cucumber-picocontainer" % CucumberVersion % "test",
  "info.cukes" %% "cucumber-scala" % CucumberVersion % "test",
  "org.typelevel" %% "cats" % "0.9.0",
//  "com.typesafe.play" %% "play-test" % PlayVersion.current,
  "net.lightbody.bmp" % "browsermob-core" % "2.1.5"
)