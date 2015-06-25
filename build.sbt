name := "gondola"

organization := "org.higherState"

version := "1.0.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % "2.11.6",
  "org.scala-lang" % "scala-reflect" % "2.11.6",
  "org.scalaz" %% "scalaz-core" % "7.1.2",
  "org.scalaz" %% "scalaz-concurrent" % "7.1.0",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

resolvers ++= Seq (
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)
