package example

import org.scalajs.dom
import shared.SharedMessages

import scala.scalajs.js
import js.Dynamic.{global => g}

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    println("Versioned favicon : " + g.jsRoutes.controllers.Assets.versioned("images/favicon.png").url)
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}
