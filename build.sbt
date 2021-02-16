name := "mc4s"

version := "1.0-SNAPSHOT"

resolvers ++= Seq("jitpack.io" at "https://jitpack.io")

scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
    "com.github.Steveice10" % "opennbt" % "1.3",
    "com.github.Steveice10" % "packetlib" % "1.8",
    "com.github.Steveice10" % "mcauthlib" % "1.3",
    "net.kyori" % "adventure-text-serializer-gson" % "4.2.0",
    "org.projectlombok" % "lombok" % "1.18.8",
    "junit" % "junit" % "4.13.1" % Test
)