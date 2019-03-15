package controllers

import javax.inject._
import models.Cliente
import play.api.mvc._
import play.api._
import data.Form
import data.Forms._
import play.twirl.api.Html
import play.api.data.validation.{Constraint, Invalid, Valid, ValidationError}



class ClienteController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
      Ok(views.html.cliente())
  }


  def cadastro() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.cliente())
  }


  val form: Form[Cliente] = Form(
    mapping(
      "id" -> number,
      "nome" -> text,
      "endereco" -> text,
      "email" -> email,
      "telefone" -> text,
      "celular" -> text,
      "cidade" -> text
    )(Cliente.apply)(Cliente.unapply)
  )

}

