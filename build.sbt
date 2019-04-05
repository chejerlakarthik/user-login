name := """user-login"""
organization := "com.codebrains"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test

maintainer := "chejerlakarthik@gmail.com"
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.codebrains.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.codebrains.binders._"
