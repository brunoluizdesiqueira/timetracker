
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

object formularioDeNovoUsuario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import b4.vertical.fieldConstructor;


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*3.2*/main("Cadastro de usuário!")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
    """),_display_(/*4.6*/b4/*4.8*/.form(routes.UsuarioController.salvaNovoUsuario)/*4.56*/ {_display_(Seq[Any](format.raw/*4.58*/("""
        """),format.raw/*5.9*/("""<h1>Cadastre-se!</h1>
        """),_display_(/*6.10*/b4/*6.12*/.text(formulario("nome"), '_label -> "Nome")),format.raw/*6.56*/("""
        """),_display_(/*7.10*/b4/*7.12*/.email(formulario("email"), '_label -> "Email")),format.raw/*7.59*/("""
        """),_display_(/*8.10*/b4/*8.12*/.password(formulario("senha"), '_label -> "Senha")),format.raw/*8.62*/("""
        """),_display_(/*9.10*/b4/*9.12*/.password(formulario("confirmaSenha"), '_label -> "Confirmação de senha")),format.raw/*9.85*/("""
        """),_display_(/*10.10*/b4/*10.12*/.submit('class -> "btn btn-primary")/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/(""" """),format.raw/*10.51*/("""Cadastrar """)))}),format.raw/*10.62*/("""
    """)))}),format.raw/*11.6*/("""
""")))}),format.raw/*12.2*/(""" """))
      }
    }
  }

  def render(formulario:Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeNovoUsuario.scala.html
                  HASH: 0cea845c6bc8421263221df62682c843d5ea5b2f
                  MATRIX: 973->1|1073->30|1139->28|1166->68|1202->96|1241->98|1272->104|1281->106|1337->154|1376->156|1411->165|1468->196|1478->198|1542->242|1578->252|1588->254|1655->301|1691->311|1701->313|1771->363|1807->373|1817->375|1910->448|1947->458|1958->460|2003->496|2043->498|2072->499|2114->510|2150->516|2182->518
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|44->12
                  -- GENERATED --
              */
          