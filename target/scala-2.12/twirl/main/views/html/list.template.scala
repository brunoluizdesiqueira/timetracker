
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[io.ebean.PagedList[Computer],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: io.ebean.PagedList[Computer], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*31.2*/header/*31.8*/(key: String, title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*31.40*/("""
    """),format.raw/*32.5*/("""<th class=""""),_display_(/*32.17*/key/*32.20*/.replace(".", "_")),format.raw/*32.38*/(""" """),format.raw/*32.39*/("""header """),_display_(/*32.47*/if(currentSortBy == key)/*32.71*/ {_display_(Seq[Any](format.raw/*32.73*/("""
        """),_display_(/*33.10*/{
            if(currentOrder == "asc") "headerSortDown" else "headerSortUp"
        }),format.raw/*35.10*/("""
    """)))}),format.raw/*36.6*/("""">
        <a href=""""),_display_(/*37.19*/link(0, key)),format.raw/*37.31*/("""">"""),_display_(/*37.34*/title),format.raw/*37.39*/("""</a>
    </th>
""")))};def /*5.2*/link/*5.6*/(newPage: Int, newSortBy: String) = {{

    var sortBy = currentSortBy
    var order = currentOrder

    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }

    // Generate the link
    routes.HomeController.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.113*/("""
"""),format.raw/*4.42*/("""
"""),format.raw/*26.2*/("""

    """),format.raw/*30.41*/("""
"""),format.raw/*39.2*/("""

"""),_display_(/*41.2*/main_/*41.7*/ {_display_(Seq[Any](format.raw/*41.9*/("""

    """),format.raw/*43.5*/("""<h1 id="homeTitle">"""),_display_(/*43.25*/Messages("computers.list.title", currentPage.getTotalCount)),format.raw/*43.84*/("""</h1>

    """),_display_(/*45.6*/if(flash.containsKey("success"))/*45.38*/ {_display_(Seq[Any](format.raw/*45.40*/("""
        """),format.raw/*46.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*47.37*/flash/*47.42*/.get("success")),format.raw/*47.57*/("""
        """),format.raw/*48.9*/("""</div>
    """)))}),format.raw/*49.6*/("""

    """),format.raw/*51.5*/("""<div id="actions">

        <form action=""""),_display_(/*53.24*/link(0, "name")),format.raw/*53.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(/*54.66*/currentFilter),format.raw/*54.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>

        <a class="btn success" id="add" href=""""),_display_(/*58.48*/routes/*58.54*/.HomeController.create()),format.raw/*58.78*/("""">Add a new computer</a>

    </div>

    """),_display_(/*62.6*/if(currentPage.getTotalCount == 0)/*62.40*/ {_display_(Seq[Any](format.raw/*62.42*/("""

        """),format.raw/*64.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>

    """)))}/*68.7*/else/*68.12*/{_display_(Seq[Any](format.raw/*68.13*/("""

        """),format.raw/*70.9*/("""<table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(/*73.22*/header("name", "Computer name")),format.raw/*73.53*/("""
                    """),_display_(/*74.22*/header("introduced", "Introduced")),format.raw/*74.56*/("""
                    """),_display_(/*75.22*/header("discontinued", "Discontinued")),format.raw/*75.60*/("""
                    """),_display_(/*76.22*/header("company.name", "Company")),format.raw/*76.55*/("""
                """),format.raw/*77.17*/("""</tr>
            </thead>
            <tbody>

            """),_display_(/*81.14*/for(computer <- currentPage.getList.asScala) yield /*81.58*/ {_display_(Seq[Any](format.raw/*81.60*/("""
                """),format.raw/*82.17*/("""<tr>
                    <td><a href=""""),_display_(/*83.35*/routes/*83.41*/.HomeController.edit(computer.getId)),format.raw/*83.77*/("""">"""),_display_(/*83.80*/computer/*83.88*/.name),format.raw/*83.93*/("""</a></td>
                    <td>
                    """),_display_(/*85.22*/if(computer.introduced == null)/*85.53*/ {_display_(Seq[Any](format.raw/*85.55*/("""
                        """),format.raw/*86.25*/("""<em>-</em>
                    """)))}/*87.23*/else/*87.28*/{_display_(Seq[Any](format.raw/*87.29*/("""
                        """),_display_(/*88.26*/computer/*88.34*/.introduced.format("dd MMM yyyy")),format.raw/*88.67*/("""
                    """)))}),format.raw/*89.22*/("""
                    """),format.raw/*90.21*/("""</td>
                    <td>
                    """),_display_(/*92.22*/if(computer.discontinued == null)/*92.55*/ {_display_(Seq[Any](format.raw/*92.57*/("""
                        """),format.raw/*93.25*/("""<em>-</em>
                    """)))}/*94.23*/else/*94.28*/{_display_(Seq[Any](format.raw/*94.29*/("""
                        """),_display_(/*95.26*/computer/*95.34*/.discontinued.format("dd MMM yyyy")),format.raw/*95.69*/("""
                    """)))}),format.raw/*96.22*/("""
                    """),format.raw/*97.21*/("""</td>
                    <td>
                    """),_display_(/*99.22*/if(computer.company == null)/*99.50*/ {_display_(Seq[Any](format.raw/*99.52*/("""
                        """),format.raw/*100.25*/("""<em>-</em>
                    """)))}/*101.23*/else/*101.28*/{_display_(Seq[Any](format.raw/*101.29*/("""
                        """),_display_(/*102.26*/computer/*102.34*/.company.name),format.raw/*102.47*/("""
                    """)))}),format.raw/*103.22*/("""
                    """),format.raw/*104.21*/("""</td>
                </tr>
            """)))}),format.raw/*106.14*/("""

            """),format.raw/*108.13*/("""</tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(/*113.18*/if(currentPage.hasPrev)/*113.41*/ {_display_(Seq[Any](format.raw/*113.43*/("""
                    """),format.raw/*114.21*/("""<li class="prev">
                        <a href=""""),_display_(/*115.35*/link(currentPage.getPageIndex - 1, null)),format.raw/*115.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*117.19*/else/*117.24*/{_display_(Seq[Any](format.raw/*117.25*/("""
                    """),format.raw/*118.21*/("""<li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))}),format.raw/*121.18*/("""
                """),format.raw/*122.17*/("""<li class="current">
                    <a>Displaying """),_display_(/*123.36*/currentPage/*123.47*/.getDisplayXtoYofZ(" to ", " of ")),format.raw/*123.81*/("""</a>
                </li>
                """),_display_(/*125.18*/if(currentPage.hasNext)/*125.41*/ {_display_(Seq[Any](format.raw/*125.43*/("""
                    """),format.raw/*126.21*/("""<li class="next">
                        <a href=""""),_display_(/*127.35*/link(currentPage.getPageIndex + 1, null)),format.raw/*127.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*129.19*/else/*129.24*/{_display_(Seq[Any](format.raw/*129.25*/("""
                    """),format.raw/*130.21*/("""<li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))}),format.raw/*133.18*/("""
            """),format.raw/*134.13*/("""</ul>
        </div>

    """)))}),format.raw/*137.6*/("""

""")))}),format.raw/*139.2*/("""

"""))
      }
    }
  }

  def render(currentPage:io.ebean.PagedList[Computer],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((io.ebean.PagedList[Computer],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jul 31 22:31:08 BRT 2017
                  SOURCE: /Users/Bruno/projetos/timetracker/app/views/list.scala.html
                  HASH: cca73890be8269a8a787c430dabadf01c0b33e05
                  MATRIX: 990->1|1180->855|1194->861|1303->893|1335->898|1374->910|1386->913|1425->931|1454->932|1489->940|1522->964|1562->966|1599->976|1706->1062|1742->1068|1790->1089|1823->1101|1853->1104|1879->1109|1917->237|1928->241|2449->112|2477->235|2505->731|2539->853|2567->1125|2596->1128|2609->1133|2648->1135|2681->1141|2728->1161|2808->1220|2846->1232|2887->1264|2927->1266|2963->1275|3062->1347|3076->1352|3112->1367|3148->1376|3190->1388|3223->1394|3293->1437|3329->1452|3437->1533|3471->1546|3701->1749|3716->1755|3761->1779|3830->1822|3873->1856|3913->1858|3950->1868|4048->1949|4061->1954|4100->1955|4137->1965|4266->2067|4318->2098|4367->2120|4422->2154|4471->2176|4530->2214|4579->2236|4633->2269|4678->2286|4766->2347|4826->2391|4866->2393|4911->2410|4977->2449|4992->2455|5049->2491|5079->2494|5096->2502|5122->2507|5205->2563|5245->2594|5285->2596|5338->2621|5389->2654|5402->2659|5441->2660|5494->2686|5511->2694|5565->2727|5618->2749|5667->2770|5746->2822|5788->2855|5828->2857|5881->2882|5932->2915|5945->2920|5984->2921|6037->2947|6054->2955|6110->2990|6163->3012|6212->3033|6291->3085|6328->3113|6368->3115|6422->3140|6474->3173|6488->3178|6528->3179|6582->3205|6600->3213|6635->3226|6689->3248|6739->3269|6812->3310|6855->3324|6993->3434|7026->3457|7067->3459|7117->3480|7197->3532|7259->3572|7344->3638|7358->3643|7398->3644|7448->3665|7597->3782|7643->3799|7727->3855|7748->3866|7804->3900|7876->3944|7909->3967|7950->3969|8000->3990|8080->4042|8142->4082|8223->4144|8237->4149|8277->4150|8327->4171|8472->4284|8514->4297|8572->4324|8606->4327
                  LINES: 28->1|32->31|32->31|34->31|35->32|35->32|35->32|35->32|35->32|35->32|35->32|35->32|36->33|38->35|39->36|40->37|40->37|40->37|40->37|42->5|42->5|64->1|65->4|66->26|68->30|69->39|71->41|71->41|71->41|73->43|73->43|73->43|75->45|75->45|75->45|76->46|77->47|77->47|77->47|78->48|79->49|81->51|83->53|83->53|84->54|84->54|88->58|88->58|88->58|92->62|92->62|92->62|94->64|98->68|98->68|98->68|100->70|103->73|103->73|104->74|104->74|105->75|105->75|106->76|106->76|107->77|111->81|111->81|111->81|112->82|113->83|113->83|113->83|113->83|113->83|113->83|115->85|115->85|115->85|116->86|117->87|117->87|117->87|118->88|118->88|118->88|119->89|120->90|122->92|122->92|122->92|123->93|124->94|124->94|124->94|125->95|125->95|125->95|126->96|127->97|129->99|129->99|129->99|130->100|131->101|131->101|131->101|132->102|132->102|132->102|133->103|134->104|136->106|138->108|143->113|143->113|143->113|144->114|145->115|145->115|147->117|147->117|147->117|148->118|151->121|152->122|153->123|153->123|153->123|155->125|155->125|155->125|156->126|157->127|157->127|159->129|159->129|159->129|160->130|163->133|164->134|167->137|169->139
                  -- GENERATED --
              */
          