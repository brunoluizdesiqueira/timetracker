
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <meta name="viewport" content="width=devce-width, initial-scale=1">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*8.105*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <link rel="stylesheets" media="screen" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("stylesheets/main.css")),format.raw/*10.95*/("""">
    </head>
    <body>
        <header class="header-tp">
            <nav class="navbar navbar-default navbar-static-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <form class="form-inline">
                            <ul class="nav navbar-nav navbar-right bdr">
                                <li><a href=""""),_display_(/*27.47*/routes/*27.53*/.UsuarioController.formularioDeNovoUsuario),format.raw/*27.95*/("""">Usuários</a></li>

                                <li><a href=""""),_display_(/*29.47*/routes/*29.53*/.ClienteController.formularioDeNovoCliente),format.raw/*29.95*/("""">Clientes</a></li>

                                <li><a href=""""),_display_(/*31.47*/routes/*31.53*/.ProjetoController.formularioDeNovoProjeto),format.raw/*31.95*/("""">Projetos</a></li>

                                <li><a href=""""),_display_(/*33.47*/routes/*33.53*/.TarefaController.formularioDeNovaTarefa),format.raw/*33.93*/("""">Tarefas</a></li>

                                <li><a href=""""),_display_(/*35.47*/routes/*35.53*/.TipoTarefaController.formularioDeNovoTipoTarefa),format.raw/*35.101*/("""">Tipos de Tarefa</a></li>

                                <li><a href=""""),_display_(/*37.47*/routes/*37.53*/.UsuarioController.formularioDeLogin),format.raw/*37.89*/("""">Login</a></li>

                                <li><a href="#" data-toggle="modal" data-target="#signIn-Modal">Sign in</a></li>

                                <li ><a href="#" data-toggle="modal" data-target="#at-signup">Sign Up</a></li>
                            </ul>
                        </form>
                    </div><!--/.nav-collapse -->
                </div>
            </nav>
        </header>

        """),_display_(/*49.10*/for(key <- Array("danger", "info", "success", "warning")) yield /*49.67*/ {_display_(Seq[Any](format.raw/*49.69*/("""
            """),_display_(/*50.14*/if(flash.containsKey(key))/*50.40*/ {_display_(Seq[Any](format.raw/*50.42*/("""
                """),format.raw/*51.17*/("""<div class="alert alert-"""),_display_(/*51.42*/key),format.raw/*51.45*/("""">
                    """),_display_(/*52.22*/flash/*52.27*/.get(key)),format.raw/*52.36*/("""
                    """),format.raw/*53.21*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i> </a>
                </div>
            """)))}),format.raw/*55.14*/("""
        """)))}),format.raw/*56.10*/("""

        """),format.raw/*58.9*/("""<main class="container">"""),_display_(/*58.34*/content),format.raw/*58.41*/("""</main>
    </body>

        <!-- Modal -->
    <div id="signIn-Modal" class="modal fade" role="dialog">
        <div class="modal-dialog">
                <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Título do modal</h4>
                </div>
                <div class="modal-body">
                    <p>Entre com o conteudo deste modal.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                </div>
            </div>
        </div>
    </div>
    """),_display_(/*79.6*/javascripts()),format.raw/*79.19*/("""
"""),format.raw/*80.1*/("""</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/main.scala.html
                  HASH: 0624e3c0a5860f330f80f26f6139198d64021031
                  MATRIX: 952->1|1077->31|1105->33|1191->93|1216->98|1380->236|1394->242|1460->287|1547->348|1561->354|1613->386|1697->443|1712->449|1767->483|2732->1421|2747->1427|2810->1469|2904->1536|2919->1542|2982->1584|3076->1651|3091->1657|3154->1699|3248->1766|3263->1772|3324->1812|3417->1878|3432->1884|3502->1932|3603->2006|3618->2012|3675->2048|4130->2476|4203->2533|4243->2535|4284->2549|4319->2575|4359->2577|4404->2594|4456->2619|4480->2622|4531->2646|4545->2651|4575->2660|4624->2681|4805->2831|4846->2841|4883->2851|4935->2876|4963->2883|5776->3670|5810->3683|5838->3684
                  LINES: 28->1|33->1|35->3|38->6|38->6|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|59->27|59->27|59->27|61->29|61->29|61->29|63->31|63->31|63->31|65->33|65->33|65->33|67->35|67->35|67->35|69->37|69->37|69->37|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|87->55|88->56|90->58|90->58|90->58|111->79|111->79|112->80
                  -- GENERATED --
              */
          