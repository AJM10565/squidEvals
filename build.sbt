name := "wf"

version := "0.3"

scalaVersion := "2.12.6"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"  % "3.0.5"  % Test,
  "org.scalamock"     %% "scalamock"  % "4.1.0"  % Test,
  "com.storm-enroute" %% "scalameter" % "0.10.1" % Test,
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,  // required only for plain JUnit testing
  "org.scalatest"  %% "scalatest"       % "3.0.5"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.14.0" % Test
)

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

logBuffered := false

parallelExecution in Test := false

enablePlugins(JavaAppPackaging)


