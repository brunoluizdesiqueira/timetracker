
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

object formularioDeNovoTipoTarefa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[TipoTarefa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[TipoTarefa]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import b4.vertical.fieldConstructor;


Seq[Any](format.raw/*1.32*/("""
"""),_display_(/*3.2*/main("Cadastro de Tipos de tarefa")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
    """),_display_(/*4.6*/b4/*4.8*/.form(routes.TipoTarefaController.salvaNovoTipoTarefa())/*4.64*/ {_display_(Seq[Any](format.raw/*4.66*/("""
        """),format.raw/*5.9*/("""<h1>Cadastre um novo tipo de tarefa</h1>
        """),_display_(/*6.10*/b4/*6.12*/.text(formulario("nome"), '_label -> "Nome", 'placeholder -> "Ex: Refatoração")),format.raw/*6.91*/("""
        """),_display_(/*7.10*/b4/*7.12*/.text(formulario("tempoEstimado"), '_label -> "Tempo estimado", 'placeholder -> "37:00")),format.raw/*7.100*/("""
        """),_display_(/*8.10*/b4/*8.12*/.submit('class -> "btn btn-primary")/*8.48*/ {_display_(Seq[Any](format.raw/*8.50*/(""" """),format.raw/*8.51*/("""Cadastrar """)))}),format.raw/*8.62*/("""
    """)))}),format.raw/*9.6*/("""
""")))}))
      }
    }
  }

  def render(formulario:Form[TipoTarefa]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[TipoTarefa]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeNovoTipoTarefa.scala.html
                  HASH: 3de36b73539769c79de64478a72d25b5dcb3701e
                  MATRIX: 979->1|1082->33|1148->31|1175->71|1218->106|1257->108|1288->114|1297->116|1361->172|1400->174|1435->183|1511->233|1521->235|1620->314|1656->324|1666->326|1775->414|1811->424|1821->426|1865->462|1904->464|1932->465|1973->476|2008->482
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|41->9
                  -- GENERATED --
              */
          