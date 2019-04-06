package model

case class User(userId: String, password: String)

object User{

  val validUsers = List(User("admin", "password"))

  def authenticate(userId: String, password: String): Boolean = {
    validUsers.contains(User(userId, password))
  }
}