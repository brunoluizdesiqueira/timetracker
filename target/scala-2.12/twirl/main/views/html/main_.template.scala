
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main_ extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        """),format.raw/*13.47*/("""
        """),format.raw/*14.9*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.119*/("""">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css")),format.raw/*16.94*/(""""/>
    </head>
    <body>

        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.HomeController.index()),format.raw/*22.56*/("""">
                    Play sample application &mdash; Computer database
                </a>
            </h1>
        </header>

        <section id="main">
        """),_display_(/*29.10*/content),format.raw/*29.17*/("""
        """),format.raw/*30.9*/("""</section>

    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/main_.scala.html
                  HASH: 68f903eaa204eb8d0c22d48198d8e6d1a4ad7166
                  MATRIX: 946->1|1056->16|1084->18|1196->593|1232->602|1320->663|1335->669|1400->712|1484->769|1499->775|1554->809|1697->925|1712->931|1756->954|1951->1122|1979->1129|2015->1138
                  LINES: 28->1|33->1|35->3|39->13|40->14|40->14|40->14|40->14|42->16|42->16|42->16|48->22|48->22|48->22|55->29|55->29|56->30
                  -- GENERATED --
              */
          