val scala3Version = "3.0.0"
val zioVersion: String = "1.0.8"
//val zioHttpVersion: String = "1.0.0.0-RC16"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-study",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9",
    libraryDependencies += "org.scalatest" %% "scalatest-freespec" % "3.2.9" % "test",
    libraryDependencies += "dev.zio" %% "zio" % zioVersion,
    libraryDependencies += "dev.zio" %% "zio-streams" % zioVersion,
    //libraryDependencies += "io.d11" %% "zhttp" % zioHttpVersion
  )
