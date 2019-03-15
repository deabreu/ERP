package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class FinanceController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.finance())
  }

  def cadastro() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.finance())
  }
}
