package controllers

import play.api._
import play.api.mvc._

object Root extends Controller {
  def apply = Action {
    Ok("This is the backend server for TheScalaCourse's github application. Probably, you have nothing to do here.")
  }  
}
