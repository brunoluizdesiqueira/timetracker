
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

object formularioDeNovoCliente extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import b4.vertical.fieldConstructor;


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Cadastro de cliente!")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
    """),_display_(/*5.6*/b4/*5.8*/.form(routes.ClienteController.salvaNovoCliente)/*5.56*/ {_display_(Seq[Any](format.raw/*5.58*/("""
        """),format.raw/*6.9*/("""<h1>Cadastre um novo cliente</h1>
        """),_display_(/*7.10*/b4/*7.12*/.text(formulario("nome"), '_label -> "Nome")),format.raw/*7.56*/("""
        """),_display_(/*8.10*/b4/*8.12*/.submit('class -> "btn btn-primary")/*8.48*/ {_display_(Seq[Any](format.raw/*8.50*/(""" """),format.raw/*8.51*/("""Cadastrar """)))}),format.raw/*8.62*/("""
    """)))}),format.raw/*9.6*/("""
""")))}),format.raw/*10.2*/(""" """))
      }
    }
  }

  def render(formulario:Form[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeNovoCliente.scala.html
                  HASH: a2e8c04f38456b3e12e874c7b04b5cd6be4ea5f6
                  MATRIX: 973->1|1073->30|1139->28|1166->67|1193->69|1229->97|1268->99|1299->105|1308->107|1364->155|1403->157|1438->166|1507->209|1517->211|1581->255|1617->265|1627->267|1671->303|1710->305|1738->306|1779->317|1814->323|1846->325
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|41->9|42->10
                  -- GENERATED --
              */
          