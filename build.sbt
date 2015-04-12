name := "pidcat"

organization := "org.mousehole"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies += "org.fusesource" % "sigar" % "1.6.4"

libraryDependencies += "org.mousehole" %% "catsofulthar" % "0.1.0-SNAPSHOT" % "provided"

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

