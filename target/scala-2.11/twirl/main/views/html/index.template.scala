
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(param:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!-- This Page composes the index.scala.html page by calling different html pages using  -->
<!-- scala template feature of play -->




"""),_display_(/*8.2*/main("Employee")/*8.18*/{_display_(Seq[Any](format.raw/*8.19*/("""
"""),format.raw/*9.1*/("""<!-- Employee Dataview -->
	"""),_display_(/*10.3*/dataview()),format.raw/*10.13*/("""
""")))}),format.raw/*11.2*/("""


"""))}
  }

  def render(param:String): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 16 23:41:58 IST 2015
                  SOURCE: /home/knoldus/workspace/playtemplateapp/app/views/index.scala.html
                  HASH: 1e1974ec2437f1a6974e6ac39ec1639386e8cbe3
                  MATRIX: 505->1|607->15|634->16|797->154|821->170|859->171|886->172|941->201|972->211|1004->213
                  LINES: 19->1|22->1|23->2|29->8|29->8|29->8|30->9|31->10|31->10|32->11
                  -- GENERATED --
              */
          