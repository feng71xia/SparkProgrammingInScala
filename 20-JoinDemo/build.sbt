name := "JoinDemo"
organization := "guru.learningjournal"
version := "0.1"
scalaVersion := "2.12.10"

autoScalaLibrary := false
val sparkVersion = "2.4.5"

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion
)

libraryDependencies ++= sparkDependencies