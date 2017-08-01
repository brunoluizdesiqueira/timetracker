
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

object formularioDeNovoProjeto extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Projeto],Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[Projeto], optionsClientes: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.6*/import b4.vertical.fieldConstructor
/*4.6*/import helper._;


Seq[Any](format.raw/*1.67*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""
    """),_display_(/*6.6*/main("Novo Projeto")/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""

        """),format.raw/*8.9*/("""<Form id = "form_Projeto" action = """"),_display_(/*8.46*/routes/*8.52*/.ProjetoController.salvaNovoProjeto),format.raw/*8.87*/("""" method = "POST"
        onsubmit = "submitForm();
        return false;">

            """),_display_(/*12.14*/b4/*12.16*/.text(
                formulario("nome"),
                'id -> "novovalor",
                '_label -> "Nome",
                'placeholder -> "Emissor de nota fiscal eletrônica..."
            )),format.raw/*17.14*/("""

            """),_display_(/*19.14*/b4/*19.16*/.textarea(
                formulario("descricao"),
                '_label -> "Descrição",
                'placeholder -> "Criação do aplicativo de emissão de NF-e...",
                'rows -> 3
            )),format.raw/*24.14*/("""

            """),_display_(/*26.14*/b4/*26.16*/.select(
                formulario("cliente.id"),
                options(optionsClientes),
                '_label -> "Cliente", '_default -> "Selecione o cliente...",
                '_showConstraints -> false
            )),format.raw/*31.14*/("""

        """),format.raw/*33.9*/("""<br>

            """),_display_(/*35.14*/b4/*35.16*/.submit('class -> "btn btn-primary")/*35.52*/ {_display_(Seq[Any](format.raw/*35.54*/(""" """),format.raw/*35.55*/("""Cadastrar """)))}),format.raw/*35.66*/("""

        """),format.raw/*37.9*/("""</Form>
    """)))}))
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
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeNovoProjeto.scala.html
                  HASH: 2bee8da01b1c46a6f905513823dc9e22a44d7dc0
                  MATRIX: 993->1|1131->73|1174->114|1220->66|1252->109|1282->131|1313->137|1341->157|1380->159|1416->169|1479->206|1493->212|1548->247|1665->337|1676->339|1895->537|1937->552|1948->554|2180->765|2222->780|2233->782|2480->1008|2517->1018|2563->1037|2574->1039|2619->1075|2659->1077|2688->1078|2730->1089|2767->1099
                  LINES: 28->1|31->3|32->4|35->1|37->4|37->5|38->6|38->6|38->6|40->8|40->8|40->8|40->8|44->12|44->12|49->17|51->19|51->19|56->24|58->26|58->26|63->31|65->33|67->35|67->35|67->35|67->35|67->35|67->35|69->37
                  -- GENERATED --
              */
          