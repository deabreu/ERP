package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class ClienteController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def cadastro() = Action {
    implicit request: Request[AnyContent] =>
      Ok(views.html.cliente())
  }
}

}
