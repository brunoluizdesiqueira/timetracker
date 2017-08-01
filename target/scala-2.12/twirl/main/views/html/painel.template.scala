
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

object painel extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Painel do usuário")/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""
    """),format.raw/*3.5*/("""<section class="jumbotron">
        <h1>Painel do usuário</h1>
        <p>Bem vindo, <strong>"""),_display_(/*5.32*/usuario/*5.39*/.getNome()),format.raw/*5.49*/("""</strong>
            ! Este é seu painel. Aqui você poderá ver sua chave de acesso e também suas requisições!</p>
    </section>
    <section class="panel panel-default">
        <header class="panel-heading">
            <h2 class="panel-title">Sua chave de acesso pessoal</h2>
        </header>
        <p class="panel-body">
            Sua chave de acesso é:
            <button class="btn" data-toggle="collapse" data-target="#tokenApi"><span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
                ver/esconder</button>
            <strong class="token collapse" id="tokenApi">"""),_display_(/*16.59*/usuario/*16.66*/.getToken().getCodigo()),format.raw/*16.89*/("""</strong>
        </p>
        <p class="panel-body">
            Para acessar a API, faça um GET na seguinte URL (adicionando no cabeçalho "API-Token" a sua chave de acesso): <pre>
        http://localhost:9000/api/projetos</pre>
        </p>
        <p class="panel-body">
            Você já fez <strong>"""),_display_(/*23.34*/usuario/*23.41*/.getAcessos().size()),format.raw/*23.61*/("""</strong> acessos a nossa API
        </p>
    </section>
    """),_display_(/*26.6*/javascripts()),format.raw/*26.19*/("""
""")))}))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/painel.scala.html
                  HASH: f5fa5fac2674978d2215289cb09d4889fe795abc
                  MATRIX: 950->1|1063->19|1090->21|1123->46|1162->48|1193->53|1313->147|1328->154|1358->164|1993->772|2009->779|2053->802|2388->1110|2404->1117|2445->1137|2534->1200|2568->1213
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|48->16|48->16|48->16|55->23|55->23|55->23|58->26|58->26
                  -- GENERATED --
              */
          