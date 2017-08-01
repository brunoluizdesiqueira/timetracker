
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

object javascripts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script type="text/javascript" src=""""),_display_(/*1.38*/routes/*1.44*/.Assets.at("bootstrap/js/jquery.min.js")),format.raw/*1.84*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*2.38*/routes/*2.44*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*2.87*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*3.38*/routes/*3.44*/.Assets.at("javascripts/submitForm.js")),format.raw/*3.83*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*4.38*/routes/*4.44*/.Assets.at("javascripts/hello.js")),format.raw/*4.78*/(""""></script>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/javascripts.scala.html
                  HASH: b13dc2b55b092319557e7849ccc57d626b17fce3
                  MATRIX: 1036->0|1099->37|1113->43|1173->83|1248->132|1262->138|1325->181|1400->230|1414->236|1473->275|1548->324|1562->330|1616->364
                  LINES: 33->1|33->1|33->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|36->4|36->4|36->4
                  -- GENERATED --
              */
          