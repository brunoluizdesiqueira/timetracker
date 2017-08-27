
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
    """),format.raw/*5.5*/("""<main role="main">
        <div class="mediahawkz-login">
            <div class="div-center">
                <div class="rkmd-form login">
                    """),_display_(/*9.22*/b4/*9.24*/.form(routes.ClienteController.salvaNovoCliente)/*9.72*/ {_display_(Seq[Any](format.raw/*9.74*/("""
                        """),format.raw/*10.25*/("""<h2 class="form-title">Cadastre um novo cliente</h2>

                        <div class="form-field">
                            <label class="field-label" for="nomeid">Nome do cliente</label>
                            <input id="nome" type="text" required name="nome" class="field-input" autocomplete="false">
                            <i class="material-icons md-18">error_outline</i>
                        </div>

                        <div class="form-row clearfix">
                            <button id="submit" class="rkmd-btn btn-lightBlue ripple-effect float-right">Cadastrar</button>
                        </div>
                    """)))}),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""</div>
            </div>
        </div>
    </main>
""")))}),format.raw/*26.2*/(""" """))
      }
    }
  }

  def render(formulario:Form[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Aug 27 18:01:44 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeNovoCliente.scala.html
                  HASH: 271fc9007769af535f7abf3caf91a7b20fa2abd2
                  MATRIX: 973->1|1073->30|1139->28|1166->67|1193->69|1229->97|1268->99|1299->104|1487->266|1497->268|1553->316|1592->318|1645->343|2333->1000|2378->1017|2462->1071
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|41->9|41->9|41->9|41->9|42->10|53->21|54->22|58->26
                  -- GENERATED --
              */
          