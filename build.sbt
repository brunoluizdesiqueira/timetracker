name := "timetracker"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.7-1" exclude("org.webjars", "jquery")
libraryDependencies += "org.webjars" % "jquery" % "3.2.1"
libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.2-P26-B4-RC1"
libraryDependencies += "org.webjars" % "bootstrap-datepicker" % "1.4.0"
libraryDependencies += "com.typesafe.play" %% "play-mailer" % "6.0.0"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "6.0.0"
libraryDependencies += "de.svenkubiak" % "jBCrypt" % "0.4"

libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.1.0" % Test
testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
