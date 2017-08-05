
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
    """),format.raw/*4.5*/("""<main role="main">
        <div class="mediahawkz-login">
            <div class="div-center">
                <div class="rkmd-form login">
                    """),_display_(/*8.22*/b4/*8.24*/.form(routes.UsuarioController.fazLogin)/*8.64*/ {_display_(Seq[Any](format.raw/*8.66*/("""

                        """),format.raw/*10.25*/("""<h2 class="form-title">Login</h2>

                        <div class="form-field">
                            <label class="field-label" for="emailid">E-mail</label>
                            <input id="email" type="text" name="email" class="field-input" autocomplete="false">
                            <i class="material-icons md-18">error_outline</i>
                        </div>

                        <div class="form-field">
                            <label class="field-label" for="emailid">Digite sua senha</label>
                            <input id="senha" type="password" name="senha" class="field-input" autocomplete="false">
                            <i class="material-icons md-18">error_outline</i>
                        </div>

                        <div class="form-row clearfix">
                            <div class="remember float-left">
                                <input type="checkbox" name="lembrar" id="lembrar" value="true">
                                <label for="lembrar">Lembrar senha?</label>
                            </div>
                            <button id="submit" class="rkmd-btn btn-lightBlue ripple-effect float-right">Entrar</button>
                        </div>

                      """),format.raw/*37.25*/("""
                    """)))}),format.raw/*38.22*/("""
                """),format.raw/*39.17*/("""</div>
            </div>
        </div>
    </main>
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
                  DATE: Fri Aug 04 20:52:30 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeLogin.scala.html
                  HASH: f573b7376a3361d0a0a9eb7165ad3485eca22618
                  MATRIX: 965->1|1063->32|1128->26|1159->68|1189->73|1210->86|1249->88|1280->93|1468->255|1478->257|1526->297|1565->299|1619->325|2909->2012|2962->2034|3007->2051
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|35->3|36->4|40->8|40->8|40->8|40->8|42->10|64->37|65->38|66->39
                  -- GENERATED --
              */
          