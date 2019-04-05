package model

case class User(userId: String, password: String)

object User{

  def authenticate(userId: String, password: String): Boolean = {
    "admin".equals(userId) && "password".equals(password)
  }
}