
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

/* DataView Template File */
object dataview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* DataView Template File */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!-- Angular app myapp handles the rendering of employee data from controller Employee-->
<!-- Adding the main ng controller to render the employees json data on the page -->
	<div class="container-fluid" data-ng-app="myapp" data-ng-controller="EmpController" data-ng-init="limitData=10"data-ng-app="myapp" data-ng-controller="EmpController" data-ng-init="limitData=10">		
		<div class="row" style="background-color: white;">
			<!-- Handling sort on the click of table headers -->
			<table class="table table-striped">
				<tr>
					<!-- adding sort on click -->
					<th ng-click="Sort('name')">Name</th>
					<th ng-click="Sort('company')">Company</th>
					<th ng-click="Sort('email')">Email</th>
					<th ng-click="Sort('phone')">Phone</th>
					<th ng-click="Sort('date')">Date</th>
				</tr>
				<!-- Rendering Employee Records data by filtering with given fields -->
				<tr
					data-ng-repeat="x in results">
					<td>"""),format.raw/*19.10*/("""{"""),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""x.name"""),format.raw/*19.18*/("""}"""),format.raw/*19.19*/("""}"""),format.raw/*19.20*/("""</td>
					<td>"""),format.raw/*20.10*/("""{"""),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""x.company"""),format.raw/*20.21*/("""}"""),format.raw/*20.22*/("""}"""),format.raw/*20.23*/("""</td>
					<td>"""),format.raw/*21.10*/("""{"""),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""x.email"""),format.raw/*21.19*/("""}"""),format.raw/*21.20*/("""}"""),format.raw/*21.21*/("""</td>
					<td>"""),format.raw/*22.10*/("""{"""),format.raw/*22.11*/("""{"""),format.raw/*22.12*/("""x.phone"""),format.raw/*22.19*/("""}"""),format.raw/*22.20*/("""}"""),format.raw/*22.21*/("""</td>
					<td>"""),format.raw/*23.10*/("""{"""),format.raw/*23.11*/("""{"""),format.raw/*23.12*/("""x.date |date:'medium'"""),format.raw/*23.33*/("""}"""),format.raw/*23.34*/("""}"""),format.raw/*23.35*/("""</td>
				</tr>
			</table>
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
                  SOURCE: /home/knoldus/workspace/playtemplateapp/app/views/dataview.scala.html
                  HASH: 6543fc1086a3d6deb0c1cde6c135e6b7a1dad117
                  MATRIX: 631->29|1588->958|1617->959|1646->960|1680->966|1709->967|1738->968|1781->983|1810->984|1839->985|1876->994|1905->995|1934->996|1977->1011|2006->1012|2035->1013|2070->1020|2099->1021|2128->1022|2171->1037|2200->1038|2229->1039|2264->1046|2293->1047|2322->1048|2365->1063|2394->1064|2423->1065|2472->1086|2501->1087|2530->1088
                  LINES: 22->2|39->19|39->19|39->19|39->19|39->19|39->19|40->20|40->20|40->20|40->20|40->20|40->20|41->21|41->21|41->21|41->21|41->21|41->21|42->22|42->22|42->22|42->22|42->22|42->22|43->23|43->23|43->23|43->23|43->23|43->23
                  -- GENERATED --
              */
          