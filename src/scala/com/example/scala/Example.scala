package com.example.scala

import akka.http.scaladsl.ClientTransport
import com.second.party.example.scala.SecondPartyExample
import packaaaa.src.scala.infra.Infra

object Example extends App {
  println(classOf[ClientTransport].getName)
  println("This is just an example...")

  println(Infra.Text)
  SecondPartyExample.main(Array())
}
