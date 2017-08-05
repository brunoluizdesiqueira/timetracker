
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

        <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
        <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:300'>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.at("css/style.css")),format.raw/*15.87*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("scss/style.scss")),format.raw/*16.89*/("""">

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
                                <li><a href=""""),_display_(/*34.47*/routes/*34.53*/.UsuarioController.formularioDeNovoUsuario),format.raw/*34.95*/("""">Usuários</a></li>

                                <li><a href=""""),_display_(/*36.47*/routes/*36.53*/.ClienteController.formularioDeNovoCliente),format.raw/*36.95*/("""">Clientes</a></li>

                                <li><a href=""""),_display_(/*38.47*/routes/*38.53*/.ProjetoController.formularioDeNovoProjeto),format.raw/*38.95*/("""">Projetos</a></li>

                                <li><a href=""""),_display_(/*40.47*/routes/*40.53*/.TarefaController.formularioDeNovaTarefa),format.raw/*40.93*/("""">Tarefas</a></li>

                                <li><a href=""""),_display_(/*42.47*/routes/*42.53*/.TipoTarefaController.formularioDeNovoTipoTarefa),format.raw/*42.101*/("""">Tipos de Tarefa</a></li>

                                <li><a href=""""),_display_(/*44.47*/routes/*44.53*/.HomeController.home()),format.raw/*44.75*/("""">Login</a></li>

                                <li><a href="#" data-toggle="modal" data-target="#signIn-Modal">Sign in</a></li>

                                <li ><a href="#" data-toggle="modal" data-target="#at-signup">Sign Up</a></li>
                            </ul>
                        </form>
                    </div><!--/.nav-collapse -->
                </div>
            </nav>
        </header>

        """),_display_(/*56.10*/for(key <- Array("danger", "info", "success", "warning")) yield /*56.67*/ {_display_(Seq[Any](format.raw/*56.69*/("""
            """),_display_(/*57.14*/if(flash.containsKey(key))/*57.40*/ {_display_(Seq[Any](format.raw/*57.42*/("""
                """),format.raw/*58.17*/("""<div class="alert alert-"""),_display_(/*58.42*/key),format.raw/*58.45*/("""">
                    """),_display_(/*59.22*/flash/*59.27*/.get(key)),format.raw/*59.36*/("""
                    """),format.raw/*60.21*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i> </a>
                </div>
            """)))}),format.raw/*62.14*/("""
        """)))}),format.raw/*63.10*/("""

        """),format.raw/*65.9*/("""<main class="container">"""),_display_(/*65.34*/content),format.raw/*65.41*/("""</main>
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
    """),_display_(/*86.6*/javascripts()),format.raw/*86.19*/("""
"""),format.raw/*87.1*/("""</html>

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
                  DATE: Fri Aug 04 21:29:42 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/main.scala.html
                  HASH: f06efe48180930281fdbe08687fdbfed0f47ff81
                  MATRIX: 952->1|1077->31|1105->33|1191->93|1216->98|1380->236|1394->242|1460->287|1547->348|1561->354|1613->386|1697->443|1712->449|1767->483|2055->744|2070->750|2118->777|2201->833|2216->839|2266->868|3232->1807|3247->1813|3310->1855|3404->1922|3419->1928|3482->1970|3576->2037|3591->2043|3654->2085|3748->2152|3763->2158|3824->2198|3917->2264|3932->2270|4002->2318|4103->2392|4118->2398|4161->2420|4616->2848|4689->2905|4729->2907|4770->2921|4805->2947|4845->2949|4890->2966|4942->2991|4966->2994|5017->3018|5031->3023|5061->3032|5110->3053|5291->3203|5332->3213|5369->3223|5421->3248|5449->3255|6262->4042|6296->4055|6324->4056
                  LINES: 28->1|33->1|35->3|38->6|38->6|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|47->15|47->15|47->15|48->16|48->16|48->16|66->34|66->34|66->34|68->36|68->36|68->36|70->38|70->38|70->38|72->40|72->40|72->40|74->42|74->42|74->42|76->44|76->44|76->44|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|94->62|95->63|97->65|97->65|97->65|118->86|118->86|119->87
                  -- GENERATED --
              */
          