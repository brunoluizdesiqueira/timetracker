
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
/*1.2*/import java.util

object formularioDeNovaTarefa extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Form[Tarefa],Form[Projeto],Map[String, String],Map[String, String],Map[String, String],Map[String, String],Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(formulario: Form[Tarefa],
        formProjeto: Form[Projeto],
        optionsMembros: Map[String, String],
        optionsResponsaveis: Map[String, String],
        optionsTipos: Map[String, String],
        optionsProjetos: Map[String, String],
        optionsClientes: Map[String, String]
):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*11.2*/import b4.vertical.fieldConstructor
/*12.2*/import helper._;


Seq[Any](format.raw/*9.2*/("""

"""),format.raw/*13.1*/("""
"""),_display_(/*14.2*/main("Cadastro de tarefa")/*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""

    """),_display_(/*16.6*/b4/*16.8*/.form(routes.TarefaController.salvaNovaTarefa)/*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""

        """),format.raw/*18.9*/("""<h1>Cadastre uma nova tarefa</h1>

        """),_display_(/*20.10*/b4/*20.12*/.text(formulario("titulo"),
            '_label -> "Título",
            'placeholder -> "Criação binding do XSD da NF-e 4.0")),format.raw/*22.66*/("""

        """),_display_(/*24.10*/b4/*24.12*/.textarea(formulario("descricao"),
            '_label -> "Descrição",
            'placeholder -> "Descreva o que devera ser realizado através desta tarefa."
        )),format.raw/*27.10*/("""


        """),format.raw/*30.9*/("""<div class="form-group">
            <label class="control-label" for="projeto_id">Selecione o projeto</label>
            <div class="input-group">

                """),_display_(/*34.18*/b4/*34.20*/.select(
                    formulario("projeto.id"),
                    options(optionsProjetos),
                    '_default -> "Selecione o projeto...",
                    '_showConstraints -> false
                )),format.raw/*39.18*/("""

                """),format.raw/*41.17*/("""<span class="input-group-btn">
                    <a href="" class="btn btn-primary" data-toggle="modal" data-target="#modalProjeto" value="Cadastrar" for="projeto_id" >
                        <span class="glyphicon glyphicon-option-horizontal"></span>
                    </a>
                </span>
            </div>
        </div>

        <br>

        """),_display_(/*51.10*/b4/*51.12*/.select(
            formulario("responsavel.id"),
            options(optionsResponsaveis),
            '_label -> "Selecione o responsável",
            '_default -> "Selecione o responsavel...",
            '_showConstraints -> false
        )),format.raw/*57.10*/("""

        """),format.raw/*59.9*/("""<br>

        """),_display_(/*61.10*/b4/*61.12*/.select(
            formulario("tipo.id"),
            options(optionsTipos),
            '_label -> "Selecione o tipo",
            '_default -> "Selecione o tipo...",
            '_showConstraints -> false
        )),format.raw/*67.10*/("""

        """),format.raw/*69.9*/("""<br>

        """),_display_(/*71.10*/b4/*71.12*/.select(
            formulario("membro.id"),
            options(optionsMembros),
            '_label -> "Selecione o membro",
            '_default -> "Selecione o membro...",
            '_showConstraints -> false
        )),format.raw/*77.10*/("""

        """),format.raw/*79.9*/("""<br>

        """),_display_(/*81.10*/b4/*81.12*/.submit('class -> "btn btn-primary")/*81.48*/ {_display_(Seq[Any](format.raw/*81.50*/(""" """),format.raw/*81.51*/("""Cadastrar """)))}),format.raw/*81.62*/("""

    """)))}),format.raw/*83.6*/("""
        """),format.raw/*84.9*/("""<!-- Modal -->
    <div id="modalProjeto" class="modal fade" role="dialog">
        <div class="modal-dialog">
                <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Cadastro de Projeto</h4>
                </div>
                <div class="modal-body">
                     """),_display_(/*94.23*/modalDeNovoProjeto(formProjeto, optionsClientes)),format.raw/*94.71*/("""
                """),format.raw/*95.17*/("""</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*103.2*/(""" """))
      }
    }
  }

  def render(formulario:Form[Tarefa],formProjeto:Form[Projeto],optionsMembros:Map[String, String],optionsResponsaveis:Map[String, String],optionsTipos:Map[String, String],optionsProjetos:Map[String, String],optionsClientes:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(formulario,formProjeto,optionsMembros,optionsResponsaveis,optionsTipos,optionsProjetos,optionsClientes)

  def f:((Form[Tarefa],Form[Projeto],Map[String, String],Map[String, String],Map[String, String],Map[String, String],Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (formulario,formProjeto,optionsMembros,optionsResponsaveis,optionsTipos,optionsProjetos,optionsClientes) => apply(formulario,formProjeto,optionsMembros,optionsResponsaveis,optionsTipos,optionsProjetos,optionsClientes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeNovaTarefa.scala.html
                  HASH: 00a9b4af141f60b717f81cc8537108c26a0abd19
                  MATRIX: 651->1|1109->19|1476->315|1520->352|1565->312|1594->369|1622->371|1657->397|1697->399|1730->406|1740->408|1795->454|1835->456|1872->466|1943->510|1954->512|2101->638|2139->649|2150->651|2339->819|2377->830|2571->997|2582->999|2827->1223|2873->1241|3262->1603|3273->1605|3540->1851|3577->1861|3619->1876|3630->1878|3869->2096|3906->2106|3948->2121|3959->2123|4206->2349|4243->2359|4285->2374|4296->2376|4341->2412|4381->2414|4410->2415|4452->2426|4489->2433|4525->2442|5033->2923|5102->2971|5147->2988|5401->3211
                  LINES: 24->1|29->2|39->11|40->12|43->9|45->13|46->14|46->14|46->14|48->16|48->16|48->16|48->16|50->18|52->20|52->20|54->22|56->24|56->24|59->27|62->30|66->34|66->34|71->39|73->41|83->51|83->51|89->57|91->59|93->61|93->61|99->67|101->69|103->71|103->71|109->77|111->79|113->81|113->81|113->81|113->81|113->81|113->81|115->83|116->84|126->94|126->94|127->95|135->103
                  -- GENERATED --
              */
          