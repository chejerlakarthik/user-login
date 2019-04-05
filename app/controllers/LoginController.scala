package controllers

import javax.inject.{Inject, Singleton}
import model.User
import play.api.mvc._

@Singleton
class LoginController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def authenticate = Action { request : Request[AnyContent] =>
    val body: AnyContent = request.body
    val jsonBody = body.asJson
    jsonBody.map { json =>
      val userId = (json \ "userId").as[String]
      val password = (json \ "password").as[String]
      User.authenticate(userId, password) match {
        case true => Ok(s"Welcome, you are now logged in as ${userId}")
        case false => Unauthorized("Invalid userId or password")
      }
    }.getOrElse {
      BadRequest("Unexpected input")
    }
  }

}
