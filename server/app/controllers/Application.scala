package controllers

import play.api.mvc._
import shared.SharedMessages

class Application extends Controller {

  def index = Action { implicit request =>
    Ok(views.html.index(SharedMessages.itWorks))
  }

}
