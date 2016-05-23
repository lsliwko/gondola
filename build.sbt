import sbt.Keys._

lazy val buildSettings = Seq(
  organization       := "io.higherState",
  scalaVersion       := "2.11.8",
  version            := "0.2.0",
  javacOptions      ++= Seq("-target", "1.8", "-source", "1.8", "-Xlint:deprecation"),
  scalacOptions     ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:implicitConversions", "-language:higherKinds", "-language:postfixOps", "-language:reflectiveCalls",
    "-unchecked",
    "-Xfatal-warnings",
    "-Yinline-warnings",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-value-discard",
    "-Xfuture"
  ),
  resolvers ++= Seq(
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
  )
)

lazy val reflect = "org.scala-lang" % "scala-reflect" % "2.11.8"
lazy val shapeless = "com.chuusai" %% "shapeless" % "2.3.0"
lazy val cats = "org.typelevel" %% "cats" % "0.5.0"
lazy val akka = "com.typesafe.akka" %% "akka-actor" % "2.4.4"
lazy val scalatest = "org.scalatest" %% "scalatest" % "2.2.4"  % "test"
lazy val kindplugin = compilerPlugin("org.spire-math" %% "kind-projector" % "0.7.1")

lazy val gondola = project
  .settings(moduleName := "gondola")
  .settings(buildSettings)
  .settings(libraryDependencies := Seq(reflect, shapeless, cats, akka, kindplugin, scalatest))

lazy val example = project
  .settings(moduleName := "gondola-examples")
  .settings(buildSettings)
  .settings(libraryDependencies := Seq(kindplugin, scalatest))
  .dependsOn(gondola)