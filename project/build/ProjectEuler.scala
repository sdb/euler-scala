import sbt._

class ProjectEuler(info: ProjectInfo) extends DefaultProject(info) {
  override def mainScalaSourcePath = path("src")
  override def testScalaSourcePath = path("test")

  val scalaTest = "org.scalatest" % "scalatest" % "1.3"
  val jUnit = "junit" % "junit" % "4.8.2"
}