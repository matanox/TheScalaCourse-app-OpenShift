lazy val app = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    scalaVersion := "2.11.7",
    libraryDependencies ++= Seq(
      ws // for play framework client calls
    )
  )

/*
 * makes ctrl+c stop the current task rather than quit sbt
 */
cancelable in Global := true

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)
