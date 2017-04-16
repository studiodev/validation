resolvers += Resolver.url(
  "tpolecat-sbt-plugin-releases",
    url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases"))(
        Resolver.ivyStylePatterns)

addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.8")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.14")

addSbtPlugin("com.geirsson" %% "sbt-scalafmt" % "0.5.5")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.1.0")


addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.1")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")