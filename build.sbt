name := """KVKSearch"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  evolutions,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.google.api-client" % "google-api-client" % "1.20.0",
  "com.google.oauth-client" % "google-oauth-client-jetty" % "1.20.0",
  "com.google.apis" % "google-api-services-drive" % "v3-rev6-1.20.0",
  "org.logback-extensions" % "logback-ext-loggly" % "0.1.1",
  "com.typesafe.akka" %% "akka-remote" % "2.4.4",
  "org.apache.poi" % "poi" % "3.16",
  "org.apache.poi" % "poi-ooxml" % "3.16",
  "org.apache.poi" % "poi-ooxml-schemas" % "3.16",
  "org.apache.poi" % "poi-scratchpad" % "3.16"
)

javaOptions in Test ++= Seq(
  "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9998",
  "-Xms512M",
  "-Xmx1536M",
  "-Xss1M",
  "-XX:MaxPermSize=384M"
)
