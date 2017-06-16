package org.rogach.scallop

abstract class ScallopConf(
  args: Seq[String] = Nil,
  commandNameAndAliases: Seq[String] = Nil
) extends ScallopConfBase(args, commandNameAndAliases) {

  override protected def guessOptionNameDefault: Boolean = false
  override protected def performOptionNameGuessing() {
    // noop, no reflection support in Scala-Native
  }

}