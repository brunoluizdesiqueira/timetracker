
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

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[Computer],Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, computerForm: Form[Computer], companies: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main_/*5.7*/ {_display_(Seq[Any](format.raw/*5.9*/("""

    """),format.raw/*7.5*/("""<h1>Edit computer</h1>

    """),_display_(/*9.6*/form(routes.HomeController.update(id))/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""

        """),format.raw/*11.9*/("""<fieldset>
            """),_display_(/*12.14*/CSRF/*12.18*/.formField),format.raw/*12.28*/("""
            """),_display_(/*13.14*/inputText(computerForm("name"), '_label -> "Computer name", '_help -> "")),format.raw/*13.87*/("""
            """),_display_(/*14.14*/inputText(computerForm("introduced"), '_label -> "Introduced date", '_help -> "")),format.raw/*14.95*/("""
            """),_display_(/*15.14*/inputText(computerForm("discontinued"), '_label -> "Discontinued date", '_help -> "")),format.raw/*15.99*/("""

            """),_display_(/*17.14*/select(
                computerForm("company.id"),
                options(companies),
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            )),format.raw/*22.14*/("""

        """),format.raw/*24.9*/("""</fieldset>

        <div class="actions">
            <input type="submit" value="Save this computer" class="btn primary"> or
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.list()),format.raw/*28.51*/("""" class="btn">Cancel</a>
        </div>

    """)))}),format.raw/*31.6*/("""

    """),_display_(/*33.6*/form(routes.HomeController.delete(id), 'class -> "topRight")/*33.66*/ {_display_(Seq[Any](format.raw/*33.68*/("""
        """),_display_(/*34.10*/CSRF/*34.14*/.formField),format.raw/*34.24*/("""
        """),format.raw/*35.9*/("""<input type="submit" value="Delete this computer" class="btn danger">
    """)))}),format.raw/*36.6*/("""

""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(id:Long,computerForm:Form[Computer],companies:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(id,computerForm,companies)

  def f:((Long,Form[Computer],Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (id,computerForm,companies) => apply(id,computerForm,companies)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/editForm.scala.html
                  HASH: 3f6672061d8e6df3d62e70ed896938c39a929566
                  MATRIX: 984->1|1129->76|1174->73|1202->92|1229->94|1241->99|1279->101|1311->107|1365->136|1411->174|1450->176|1487->186|1538->210|1551->214|1582->224|1623->238|1717->311|1758->325|1860->406|1901->420|2007->505|2049->520|2291->741|2328->751|2504->900|2519->906|2562->928|2638->974|2671->981|2740->1041|2780->1043|2817->1053|2830->1057|2861->1067|2897->1076|3002->1151|3035->1154
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|41->9|41->9|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|54->22|56->24|60->28|60->28|60->28|63->31|65->33|65->33|65->33|66->34|66->34|66->34|67->35|68->36|70->38
                  -- GENERATED --
              */
          