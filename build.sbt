name := "twest"

organization := "com.mccv"

version := "0.1-SNAPSJHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq (
  "com.firebase" % "firebase-client" % "1.0.18",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "oauth.signpost" % "signpost-core" % "1.2.1.2",
  "org.twitter4j" % "twitter4j-core" % "4.0.1",
  "com.twitter" % "hbc-core" % "2.2.0",
  "org.codehaus.jackson" % "jackson-core-asl" % "1.9.13"
)