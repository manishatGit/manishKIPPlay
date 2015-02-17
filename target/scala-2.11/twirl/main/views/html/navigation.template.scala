
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object navigation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- Main Navigation bar -->

"""),format.raw/*3.27*/("""
 	"""),format.raw/*4.3*/("""<!-- Navigation Header --> 	
    <nav class="navbar navbar-default">
   
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">View Employees</a>
    </div>

	<!-- Navigation Menus  -->
    
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="navitems"><a href="#">Add <span class="sr-only">(current)</span></a></li>
        <li class="navitems"><a href="#">Edit</a></li>
        <li class="navitems"><a href="#">Delete</a></li>
      </ul>
      <div style="float: right;">
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group" align="right">
          <input type="text" class="form-control" placeholder="Search Employees" data-ng-model="searchInList">
        </div>
        <button type="submit" class="btn btn-default" data-ng-model="searchInList">Find</button>
      </form>
      </div>
    </div>
  
</nav>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 16 23:39:32 IST 2015
                  SOURCE: /home/knoldus/workspace/playtemplateapp/app/views/navigation.scala.html
                  HASH: ff5c1b0ef7b4acb5b0edbaa1066df33a46d55b72
                  MATRIX: 585->0|642->56|671->59
                  LINES: 22->1|24->3|25->4
                  -- GENERATED --
              */
          