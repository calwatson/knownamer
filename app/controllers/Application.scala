package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def states = Action {
    Ok(views.html.states())
  }

  def popularity = Action {
    Ok(views.html.popularity())
  }

  def search = Action {
    Ok(views.html.search())
  }
  def search2 = Action {
    Ok(views.html.search2())
  }

  def listResults = Action {
    Ok(views.html.listresults())
  }
  
}