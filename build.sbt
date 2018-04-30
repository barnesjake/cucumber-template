

name := "cucumber_test_project"

version := "0.0.1"

scalaVersion := "2.11.8"

val ScalatestVersion = "3.0.5"
val CucumberVersion = "1.2.5"

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

val hmrcRepoHost = java.lang.System.getProperty("hmrc.repo.host", "https://nexus-preview.tax.service.gov.uk")

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers ++= Seq(
  "hmrc-snapshots" at hmrcRepoHost + "/content/repositories/hmrc-snapshots",
  "hmrc-releases" at hmrcRepoHost + "/content/repositories/hmrc-releases",
  "typesafe-releases" at hmrcRepoHost + "/content/repositories/typesafe-releases")

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % ScalatestVersion % "test" excludeAll( ExclusionRule(organization = "org.seleniumhq.selenium") ),
  "org.seleniumhq.selenium" % "selenium-java" % "3.7.1" % "test",
  "com.google.guava" % "guava" % "23.0",
  "org.pegdown" % "pegdown" % "1.6.0" % "test",
  "info.cukes" % "cucumber-junit" % CucumberVersion % "test",
  "info.cukes" % "cucumber-picocontainer" % CucumberVersion % "test",
  "info.cukes" %% "cucumber-scala" % CucumberVersion % "test",
  "org.typelevel" %% "cats" % "0.9.0",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "net.lightbody.bmp" % "browsermob-core" % "2.1.5"
)
