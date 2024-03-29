package io.typecraft.ender

import io.circe.generic.AutoDerivation
import io.typecraft.ender.config.CirceScalaCodecExtension
import io.typecraft.ender.option.OptionExtension
import io.typecraft.ender.persistent.{
  DoobieJavaCodecExtension,
  DoobieScalaCodecExtension
}
import io.typecraft.ender.rw.{FileIOExtension, StreamIOExtension}

trait AllExtension
    extends FileIOExtension
    with StreamIOExtension
    with DoobieJavaCodecExtension
    with DoobieScalaCodecExtension
    with CirceScalaCodecExtension
    with AutoDerivation
    with OptionExtension

object implicits extends AllExtension
