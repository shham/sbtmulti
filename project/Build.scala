import sbt._
import Keys._

object TestBuild extends Build {
        lazy val foo = Project(id = "foo", base = file("./foo"))
        lazy val bar = Project(id = "bar", base = file("./bar"))
}

