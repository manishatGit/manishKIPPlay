
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

/* title Template File */
object title extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* title Template File */
  def apply/*2.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<!-- Renders title passed as string -->
<head>
	<title>"""),_display_(/*5.10*/title),format.raw/*5.15*/("""</title>
</head>

"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 16 23:52:51 IST 2015
                  SOURCE: /home/knoldus/workspace/playtemplateapp/app/views/title.scala.html
                  HASH: fa64135c0624711c7b9cd7921a8a6ec6b59eb607
                  MATRIX: 547->27|650->42|677->43|759->99|784->104
                  LINES: 19->2|22->2|23->3|25->5|25->5
                  -- GENERATED --
              */
          