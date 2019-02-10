import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.8"
    )),
    name := "scala-processing",
    libraryDependencies += processing
  )

