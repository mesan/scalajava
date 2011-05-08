import sbt._

class ScalaJava(info: ProjectInfo) extends ParentProject(info) {
	lazy val persistens = project("persistens", "persistens", new DefaultProject(_) with Dependencies {
    val hibernate = "org.hibernate" % "hibernate-entitymanager" % "3.6.1.Final"
    val hsql = "org.hsqldb" % "hsqldb" % "2.0.0"
  })

  trait Dependencies {
    val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test"
    val junit = "junit" % "junit" % "4.6" % "test"
    val mockito = "org.mockito" % "mockito-all" % "1.8.1" % "test"
  }

  val jbossRepo = "JBoss repo" at "https://repository.jboss.org/nexus/content/groups/public-jboss/"
}
