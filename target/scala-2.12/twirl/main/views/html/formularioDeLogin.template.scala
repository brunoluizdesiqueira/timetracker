
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

object formularioDeLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import b4.vertical.fieldConstructor


Seq[Any](format.raw/*1.27*/("""
    """),format.raw/*3.1*/("""    """),_display_(/*3.6*/main("Login")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
        """),_display_(/*4.10*/b4/*4.12*/.form(routes.UsuarioController.fazLogin)/*4.52*/ {_display_(Seq[Any](format.raw/*4.54*/("""
            """),format.raw/*5.13*/("""<h1>Login</h1>
            """),_display_(/*6.14*/b4/*6.16*/.email(formulario("email"), '_label -> "Email", 'autocomplete -> false)),format.raw/*6.87*/("""
            """),_display_(/*7.14*/b4/*7.16*/.password(formulario("senha"), '_label -> "Senha", 'autocomplete -> false)),format.raw/*7.90*/("""
            """),_display_(/*8.14*/b4/*8.16*/.checkbox(formulario("lembrar"), '_text -> "Lembre-me", 'value -> true)),format.raw/*8.87*/("""
            """),_display_(/*9.14*/b4/*9.16*/.submit('class -> "btn btn-primary")/*9.52*/ {_display_(Seq[Any](format.raw/*9.54*/(""" """),format.raw/*9.55*/("""Entrar """)))}),format.raw/*9.63*/("""
        """)))}),format.raw/*10.10*/("""
    """)))}))
      }
    }
  }

  def render(formulario:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeLogin.scala.html
                  HASH: 7b4cf08bc3355a09701404e86ea905b1442d934f
                  MATRIX: 965->1|1063->32|1128->26|1159->68|1189->73|1210->86|1249->88|1285->98|1295->100|1343->140|1382->142|1422->155|1476->183|1486->185|1577->256|1617->270|1627->272|1721->346|1761->360|1771->362|1862->433|1902->447|1912->449|1956->485|1995->487|2023->488|2061->496|2102->506
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|41->9|42->10
                  -- GENERATED --
              */
          