
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

object modalDeNovoProjeto extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Projeto],Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[Projeto], optionsClientes: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.6*/import b4.vertical.fieldConstructor
/*4.6*/import helper._;


Seq[Any](format.raw/*1.67*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""
    """),format.raw/*6.5*/("""<Form id = "form_Projeto" action = """"),_display_(/*6.42*/routes/*6.48*/.ProjetoController.salvaNovoProjeto),format.raw/*6.83*/("""" method = "POST"
    onsubmit = "submitForm();
    return false;">

        """),_display_(/*10.10*/b4/*10.12*/.text(
            formulario("nome"),
            'id -> "novovalor",
            '_label -> "Nome",
            'placeholder -> "Emissor de nota fiscal eletrônica..."
        )),format.raw/*15.10*/("""

        """),_display_(/*17.10*/b4/*17.12*/.textarea(
            formulario("descricao"),
            '_label -> "Descrição",
            'placeholder -> "Criação do aplicativo de emissão de NF-e...",
            'rows -> 3
        )),format.raw/*22.10*/("""

        """),_display_(/*24.10*/b4/*24.12*/.select(
            formulario("cliente.id"),
            options(optionsClientes),
            '_label -> "Cliente", '_default -> "Selecione o cliente...",
            '_showConstraints -> false
        )),format.raw/*29.10*/("""

    """),format.raw/*31.5*/("""<br>

        """),_display_(/*33.10*/b4/*33.12*/.submit('class -> "btn btn-primary")/*33.48*/ {_display_(Seq[Any](format.raw/*33.50*/(""" """),format.raw/*33.51*/("""Cadastrar """)))}),format.raw/*33.62*/("""

    """),format.raw/*35.5*/("""</Form>
"""))
      }
    }
  }

  def render(formulario:Form[Projeto],optionsClientes:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(formulario,optionsClientes)

  def f:((Form[Projeto],Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (formulario,optionsClientes) => apply(formulario,optionsClientes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/modalDeNovoProjeto.scala.html
                  HASH: 7a02ce9bc21548f9729bba12e64b2702ebde8cc8
                  MATRIX: 988->1|1126->73|1169->114|1215->66|1247->109|1277->131|1308->136|1371->173|1385->179|1440->214|1545->292|1556->294|1755->472|1793->483|1804->485|2016->676|2054->687|2065->689|2292->895|2325->901|2367->916|2378->918|2423->954|2463->956|2492->957|2534->968|2567->974
                  LINES: 28->1|31->3|32->4|35->1|37->4|37->5|38->6|38->6|38->6|38->6|42->10|42->10|47->15|49->17|49->17|54->22|56->24|56->24|61->29|63->31|65->33|65->33|65->33|65->33|65->33|65->33|67->35
                  -- GENERATED --
              */
          