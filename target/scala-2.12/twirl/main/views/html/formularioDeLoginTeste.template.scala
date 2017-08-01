
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

object formularioDeLoginTeste extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
    """),_display_(/*2.6*/main("Login teste")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
        """),format.raw/*3.9*/("""<div class="center"><button data-toggle="modal" data-target="#squarespaceModal" class="btn btn-primary center-block">
            Click Me</button></div>

            <!-- line modal -->
        <div class="modal fade" id="squarespaceModal" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                            ×</span><span class="sr-only">Close</span></button>
                        <h3 class="modal-title" id="lineModalLabel">My Modal</h3>
                    </div>
                    <div class="modal-body">

                            <!-- content goes here -->
                        <form>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email address</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputFile">File input</label>
                                <input type="file" id="exampleInputFile">
                                <p class="help-block">Example block-level help text here.</p>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> Check me out
                                </label>
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </form>

                    </div>
                    <div class="modal-footer">
                        <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                            </div>
                            <div class="btn-group btn-delete hidden" role="group">
                                <button type="button" id="delImage" class="btn btn-default btn-hover-red" data-dismiss="modal" role="button">
                                    Delete</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button type="button" id="saveImage" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                    Save</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*59.6*/("""
"""))
      }
    }
  }

  def render(formulario:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/formularioDeLoginTeste.scala.html
                  HASH: f92f424b79d93f81a1533ce354a5182a5711f11b
                  MATRIX: 970->1|1090->26|1121->32|1148->51|1187->53|1222->62|4559->3369
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|91->59
                  -- GENERATED --
              */
          