name := "polyline-scala"

version := "1.2.0"

organization := "com.github.trifectalabs"

scalaVersion := "2.11.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

crossScalaVersions := List("2.11.6", "2.12.15", "2.13.7")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra :=
  <url>[project_url]</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://www.opensource.org/licenses/mit-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:trifectalabs/polyline-scala.git</url>
    <connection>scm:git:git@github.com:trifectalabs/polyline-scala.git</connection>
  </scm>
  <developers>
    <developer>
      <id>kiambogo</id>
      <name>Christopher Poenaru</name>
      <url>chrispoenaru.com</url>
    </developer>
  </developers>
