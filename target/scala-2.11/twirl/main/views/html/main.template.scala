
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!-- Main contents: render all the pages in one page  -->

<!DOCTYPE html>

<html>
    <head>
		<link rel="stylesheet" media="screen" href=""""),_display_(/*8.48*/routes/*8.54*/.Assets.at("stylesheets/main.css")),format.raw/*8.88*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/hello.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
        <!-- Includes Jquery library -->

		<script src= """"),_display_(/*13.18*/routes/*13.24*/.Assets.at("javascripts/jquery-2.1.3.min.js")),format.raw/*13.69*/("""" type="text/javascript"></script>

		<!-- Includes Angular library -->
		<script src=""""),_display_(/*16.17*/routes/*16.23*/.Assets.at("javascripts/angular.min.js")),format.raw/*16.63*/("""" type="text/javascript"></script>
		<!-- Includes Bootstrap Css -->
				
	     <link rel="stylesheet" media="screen" href=""""),_display_(/*19.52*/routes/*19.58*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*19.101*/("""">
		<!-- Includes Main Css  -->
  		
  		<link rel="stylesheet" media="screen" href=""""),_display_(/*22.50*/routes/*22.56*/.Assets.at("stylesheets/main.css")),format.raw/*22.90*/("""">
        
		<!-- Includes default java script for the page -->
		
		<script src=""""),_display_(/*26.17*/routes/*26.23*/.Assets.at("javascripts/script.js")),format.raw/*26.58*/("""" type="text/javascript"></script>

		<!-- Includes Controller.js of Angular which contain Employee data in json format -->

		<script src=""""),_display_(/*30.17*/routes/*30.23*/.Assets.at("javascripts/controller.js")),format.raw/*30.62*/("""" type="text/javascript"></script>
   </head>
    <body class="mainbody">
    """),_display_(/*33.6*/header()),format.raw/*33.14*/("""
	"""),format.raw/*34.2*/("""<!-- Page Navigation -->
	"""),_display_(/*35.3*/navigation()),format.raw/*35.15*/("""	
	"""),format.raw/*36.2*/("""<!-- Data View Port  -->
     """),_display_(/*37.7*/content),format.raw/*37.14*/("""
    """),format.raw/*38.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 06:23:39 IST 2015
                  SOURCE: /home/knoldus/workspace/playtemplateapp/app/views/main.scala.html
                  HASH: ef6cd79c3af27b4b620f725bd237dee3fb83a342
                  MATRIX: 509->1|627->31|654->32|821->173|835->179|889->213|976->274|990->280|1042->312|1094->337|1109->343|1164->377|1285->471|1300->477|1366->522|1481->610|1496->616|1557->656|1709->781|1724->787|1789->830|1903->917|1918->923|1973->957|2084->1041|2099->1047|2155->1082|2323->1223|2338->1229|2398->1268|2503->1347|2532->1355|2561->1357|2614->1384|2647->1396|2677->1399|2734->1430|2762->1437|2794->1442
                  LINES: 19->1|22->1|23->2|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|34->13|34->13|34->13|37->16|37->16|37->16|40->19|40->19|40->19|43->22|43->22|43->22|47->26|47->26|47->26|51->30|51->30|51->30|54->33|54->33|55->34|56->35|56->35|57->36|58->37|58->37|59->38
                  -- GENERATED --
              */
          