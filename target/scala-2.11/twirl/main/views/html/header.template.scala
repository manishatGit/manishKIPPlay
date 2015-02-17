
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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!-- Header Page -->
"""),format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<div class="row">
			<div class="col-md-6 col-xs-6">
				<h1>
					<b>LEARN TEMPLATES</b>
				</h1>
				<p>
					<b>learn, apply and observe the components of css</b>
				<p>
				<div></div>
			</div>
			<div class="col-md-6 col-xs-6">
				<img
					src=""""),_display_(/*16.12*/routes/*16.18*/.Assets.at("images/header.jpg")),format.raw/*16.49*/(""""
					class="img-responsive" width="40%"></img>
			</div>
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 16 23:39:33 IST 2015
                  SOURCE: /home/knoldus/workspace/playtemplateapp/app/views/header.scala.html
                  HASH: 8c977876319d1e2689fe1e7bfbf4b764938e02b4
                  MATRIX: 581->1|629->48|656->49|939->305|954->311|1006->342
                  LINES: 22->2|23->3|24->4|36->16|36->16|36->16
                  -- GENERATED --
              */
          