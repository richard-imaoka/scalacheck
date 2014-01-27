name := "commands-nix"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Libvirt Releases" at "http://www.libvirt.org/maven2"
)

libraryDependencies ++= Seq(
  "org.scala-sbt" %  "test-interface" % "1.0",
  "net.java.dev.jna" % "jna" % "4.0.0"
)

javacOptions ++= Seq("-Xmx1024M")
