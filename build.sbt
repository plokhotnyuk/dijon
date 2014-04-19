import SonatypeKeys._

name := "dijon"

version := "0.2.3"

description := "Boiler-free JSON wrangling using Scala dynamic types"

homepage := Some(url("http://github.com/pathikrit/dijon"))

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

organization := "com.github.pathikrit"

scalaVersion := "2.10.4"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature",
  "-language:postfixOps,implicitConversions,experimental.macros,dynamics,existentials,higherKinds"
)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.specs2" %% "specs2" % "2.3.11" % "test"
)

sonatypeSettings

ScoverageSbtPlugin.instrumentSettings

CoverallsPlugin.coverallsSettings

CoverallsPlugin.CoverallsKeys.coverallsToken := Some("m1ICpWHwSZMMvgqeKbUaRE6RFre1p3zws")

autoCompilerPlugins := true

pomExtra := {
  <url>http://github.com/pathikrit/dijon</url>
  <licenses>
    <license>
      <name>The MIT License</name>
      <url>http://www.opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:pathikrit/dijon.git</url>
    <connection>scm:git:git@github.com:pathikrit/dijon.git</connection>
  </scm>
  <developers>
    <developer>
      <id>pathikrit</id>
      <name>Pathikrit Bhowmick</name>
      <url>http://github.com/pathikrit</url>
    </developer>
  </developers>
}
