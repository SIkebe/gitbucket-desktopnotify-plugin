val Organization = "me.huzi.gitbucket"
val ProjectName = "gitbucket-desktopnotify-plugin"
val ProjectVersion = "4.10.0"

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

organization := Organization
name := ProjectName
version := ProjectVersion
scalaVersion := "2.12.1"
gitbucketVersion := "4.24.1"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps", "-Ydelambdafy:method", "-target:jvm-1.8")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true

