
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Bruno/projetos/timetracker/conf/routes
// @DATE:Mon Jul 31 22:31:08 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  UsuarioController_2: controllers.UsuarioController,
  // @LINE:15
  ClienteController_6: controllers.ClienteController,
  // @LINE:18
  ProjetoController_0: controllers.ProjetoController,
  // @LINE:22
  TarefaController_5: controllers.TarefaController,
  // @LINE:25
  TipoTarefaController_3: controllers.TipoTarefaController,
  // @LINE:30
  HomeController_1: controllers.HomeController,
  // @LINE:47
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    UsuarioController_2: controllers.UsuarioController,
    // @LINE:15
    ClienteController_6: controllers.ClienteController,
    // @LINE:18
    ProjetoController_0: controllers.ProjetoController,
    // @LINE:22
    TarefaController_5: controllers.TarefaController,
    // @LINE:25
    TipoTarefaController_3: controllers.TipoTarefaController,
    // @LINE:30
    HomeController_1: controllers.HomeController,
    // @LINE:47
    Assets_4: controllers.Assets
  ) = this(errorHandler, UsuarioController_2, ClienteController_6, ProjetoController_0, TarefaController_5, TipoTarefaController_3, HomeController_1, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UsuarioController_2, ClienteController_6, ProjetoController_0, TarefaController_5, TipoTarefaController_3, HomeController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.formularioDeNovoUsuario"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.salvaNovoUsuario"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/confirma/""" + "$" + """email<[^/]+>/""" + "$" + """codigo<[^/]+>""", """controllers.UsuarioController.confirmaUsuario(email:String, codigo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/painel""", """controllers.UsuarioController.painel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login_""", """controllers.UsuarioController.formularioDeLoginTeste"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.formularioDeLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.fazLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UsuarioController.fazLogout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cliente/novo""", """controllers.ClienteController.formularioDeNovoCliente"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cliente/novo""", """controllers.ClienteController.salvaNovoCliente"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projeto/novo""", """controllers.ProjetoController.formularioDeNovoProjeto"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projeto/novo""", """controllers.ProjetoController.modalDeNovoProjeto"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projeto/novo""", """controllers.ProjetoController.salvaNovoProjeto"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefa/novo""", """controllers.TarefaController.formularioDeNovaTarefa"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefa/novo""", """controllers.TarefaController.salvaNovaTarefa"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipotarefa/novo""", """controllers.TipoTarefaController.formularioDeNovoTipoTarefa"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tipotarefa/novo""", """controllers.TipoTarefaController.salvaNovoTipoTarefa"""),
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/new""", """controllers.HomeController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>/delete""", """controllers.HomeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario0_invoker = createInvoker(
    UsuarioController_2.formularioDeNovoUsuario,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeNovoUsuario",
      Nil,
      "GET",
      this.prefix + """usuario/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario1_invoker = createInvoker(
    UsuarioController_2.salvaNovoUsuario,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "salvaNovoUsuario",
      Nil,
      "POST",
      this.prefix + """usuario/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UsuarioController_confirmaUsuario2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/confirma/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("codigo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_confirmaUsuario2_invoker = createInvoker(
    UsuarioController_2.confirmaUsuario(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "confirmaUsuario",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """usuario/confirma/""" + "$" + """email<[^/]+>/""" + "$" + """codigo<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UsuarioController_painel3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/painel")))
  )
  private[this] lazy val controllers_UsuarioController_painel3_invoker = createInvoker(
    UsuarioController_2.painel,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "painel",
      Nil,
      "GET",
      this.prefix + """usuario/painel""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UsuarioController_formularioDeLoginTeste4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login_")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeLoginTeste4_invoker = createInvoker(
    UsuarioController_2.formularioDeLoginTeste,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeLoginTeste",
      Nil,
      "GET",
      this.prefix + """login_""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UsuarioController_formularioDeLogin5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeLogin5_invoker = createInvoker(
    UsuarioController_2.formularioDeLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeLogin",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UsuarioController_fazLogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_fazLogin6_invoker = createInvoker(
    UsuarioController_2.fazLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "fazLogin",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UsuarioController_fazLogout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UsuarioController_fazLogout7_invoker = createInvoker(
    UsuarioController_2.fazLogout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "fazLogout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ClienteController_formularioDeNovoCliente8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cliente/novo")))
  )
  private[this] lazy val controllers_ClienteController_formularioDeNovoCliente8_invoker = createInvoker(
    ClienteController_6.formularioDeNovoCliente,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "formularioDeNovoCliente",
      Nil,
      "GET",
      this.prefix + """cliente/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ClienteController_salvaNovoCliente9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cliente/novo")))
  )
  private[this] lazy val controllers_ClienteController_salvaNovoCliente9_invoker = createInvoker(
    ClienteController_6.salvaNovoCliente,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "salvaNovoCliente",
      Nil,
      "POST",
      this.prefix + """cliente/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProjetoController_formularioDeNovoProjeto10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projeto/novo")))
  )
  private[this] lazy val controllers_ProjetoController_formularioDeNovoProjeto10_invoker = createInvoker(
    ProjetoController_0.formularioDeNovoProjeto,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjetoController",
      "formularioDeNovoProjeto",
      Nil,
      "GET",
      this.prefix + """projeto/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProjetoController_modalDeNovoProjeto11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projeto/novo")))
  )
  private[this] lazy val controllers_ProjetoController_modalDeNovoProjeto11_invoker = createInvoker(
    ProjetoController_0.modalDeNovoProjeto,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjetoController",
      "modalDeNovoProjeto",
      Nil,
      "GET",
      this.prefix + """projeto/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProjetoController_salvaNovoProjeto12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projeto/novo")))
  )
  private[this] lazy val controllers_ProjetoController_salvaNovoProjeto12_invoker = createInvoker(
    ProjetoController_0.salvaNovoProjeto,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjetoController",
      "salvaNovoProjeto",
      Nil,
      "POST",
      this.prefix + """projeto/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_TarefaController_formularioDeNovaTarefa13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefa/novo")))
  )
  private[this] lazy val controllers_TarefaController_formularioDeNovaTarefa13_invoker = createInvoker(
    TarefaController_5.formularioDeNovaTarefa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TarefaController",
      "formularioDeNovaTarefa",
      Nil,
      "GET",
      this.prefix + """tarefa/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_TarefaController_salvaNovaTarefa14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefa/novo")))
  )
  private[this] lazy val controllers_TarefaController_salvaNovaTarefa14_invoker = createInvoker(
    TarefaController_5.salvaNovaTarefa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TarefaController",
      "salvaNovaTarefa",
      Nil,
      "POST",
      this.prefix + """tarefa/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_TipoTarefaController_formularioDeNovoTipoTarefa15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipotarefa/novo")))
  )
  private[this] lazy val controllers_TipoTarefaController_formularioDeNovoTipoTarefa15_invoker = createInvoker(
    TipoTarefaController_3.formularioDeNovoTipoTarefa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TipoTarefaController",
      "formularioDeNovoTipoTarefa",
      Nil,
      "GET",
      this.prefix + """tipotarefa/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_TipoTarefaController_salvaNovoTipoTarefa16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tipotarefa/novo")))
  )
  private[this] lazy val controllers_TipoTarefaController_salvaNovoTipoTarefa16_invoker = createInvoker(
    TipoTarefaController_3.salvaNovoTipoTarefa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TipoTarefaController",
      "salvaNovoTipoTarefa",
      Nil,
      "POST",
      this.prefix + """tipotarefa/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_index17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index17_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """
 Default path will just redirect to the computer list""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_list18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_list18_invoker = createInvoker(
    HomeController_1.list(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """computers""",
      """ Computers list (look at the default values for pagination parameters)""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_create19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/new")))
  )
  private[this] lazy val controllers_HomeController_create19_invoker = createInvoker(
    HomeController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "GET",
      this.prefix + """computers/new""",
      """ Add computer""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_save20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_save20_invoker = createInvoker(
    HomeController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Nil,
      "POST",
      this.prefix + """computers""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_edit21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_edit21_invoker = createInvoker(
    HomeController_1.edit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """computers/""" + "$" + """id<[^/]+>""",
      """ Edit existing computer""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_update22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_update22_invoker = createInvoker(
    HomeController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """computers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_delete23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_HomeController_delete23_invoker = createInvoker(
    HomeController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """computers/""" + "$" + """id<[^/]+>/delete""",
      """ Delete a computer""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_at24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at24_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_UsuarioController_formularioDeNovoUsuario0_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeNovoUsuario0_invoker.call(UsuarioController_2.formularioDeNovoUsuario)
      }
  
    // @LINE:6
    case controllers_UsuarioController_salvaNovoUsuario1_route(params) =>
      call { 
        controllers_UsuarioController_salvaNovoUsuario1_invoker.call(UsuarioController_2.salvaNovoUsuario)
      }
  
    // @LINE:7
    case controllers_UsuarioController_confirmaUsuario2_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("codigo", None)) { (email, codigo) =>
        controllers_UsuarioController_confirmaUsuario2_invoker.call(UsuarioController_2.confirmaUsuario(email, codigo))
      }
  
    // @LINE:8
    case controllers_UsuarioController_painel3_route(params) =>
      call { 
        controllers_UsuarioController_painel3_invoker.call(UsuarioController_2.painel)
      }
  
    // @LINE:10
    case controllers_UsuarioController_formularioDeLoginTeste4_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeLoginTeste4_invoker.call(UsuarioController_2.formularioDeLoginTeste)
      }
  
    // @LINE:11
    case controllers_UsuarioController_formularioDeLogin5_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeLogin5_invoker.call(UsuarioController_2.formularioDeLogin)
      }
  
    // @LINE:12
    case controllers_UsuarioController_fazLogin6_route(params) =>
      call { 
        controllers_UsuarioController_fazLogin6_invoker.call(UsuarioController_2.fazLogin)
      }
  
    // @LINE:13
    case controllers_UsuarioController_fazLogout7_route(params) =>
      call { 
        controllers_UsuarioController_fazLogout7_invoker.call(UsuarioController_2.fazLogout)
      }
  
    // @LINE:15
    case controllers_ClienteController_formularioDeNovoCliente8_route(params) =>
      call { 
        controllers_ClienteController_formularioDeNovoCliente8_invoker.call(ClienteController_6.formularioDeNovoCliente)
      }
  
    // @LINE:16
    case controllers_ClienteController_salvaNovoCliente9_route(params) =>
      call { 
        controllers_ClienteController_salvaNovoCliente9_invoker.call(ClienteController_6.salvaNovoCliente)
      }
  
    // @LINE:18
    case controllers_ProjetoController_formularioDeNovoProjeto10_route(params) =>
      call { 
        controllers_ProjetoController_formularioDeNovoProjeto10_invoker.call(ProjetoController_0.formularioDeNovoProjeto)
      }
  
    // @LINE:19
    case controllers_ProjetoController_modalDeNovoProjeto11_route(params) =>
      call { 
        controllers_ProjetoController_modalDeNovoProjeto11_invoker.call(ProjetoController_0.modalDeNovoProjeto)
      }
  
    // @LINE:20
    case controllers_ProjetoController_salvaNovoProjeto12_route(params) =>
      call { 
        controllers_ProjetoController_salvaNovoProjeto12_invoker.call(ProjetoController_0.salvaNovoProjeto)
      }
  
    // @LINE:22
    case controllers_TarefaController_formularioDeNovaTarefa13_route(params) =>
      call { 
        controllers_TarefaController_formularioDeNovaTarefa13_invoker.call(TarefaController_5.formularioDeNovaTarefa)
      }
  
    // @LINE:23
    case controllers_TarefaController_salvaNovaTarefa14_route(params) =>
      call { 
        controllers_TarefaController_salvaNovaTarefa14_invoker.call(TarefaController_5.salvaNovaTarefa)
      }
  
    // @LINE:25
    case controllers_TipoTarefaController_formularioDeNovoTipoTarefa15_route(params) =>
      call { 
        controllers_TipoTarefaController_formularioDeNovoTipoTarefa15_invoker.call(TipoTarefaController_3.formularioDeNovoTipoTarefa)
      }
  
    // @LINE:26
    case controllers_TipoTarefaController_salvaNovoTipoTarefa16_route(params) =>
      call { 
        controllers_TipoTarefaController_salvaNovoTipoTarefa16_invoker.call(TipoTarefaController_3.salvaNovoTipoTarefa)
      }
  
    // @LINE:30
    case controllers_HomeController_index17_route(params) =>
      call { 
        controllers_HomeController_index17_invoker.call(HomeController_1.index())
      }
  
    // @LINE:33
    case controllers_HomeController_list18_route(params) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_HomeController_list18_invoker.call(HomeController_1.list(p, s, o, f))
      }
  
    // @LINE:36
    case controllers_HomeController_create19_route(params) =>
      call { 
        controllers_HomeController_create19_invoker.call(HomeController_1.create())
      }
  
    // @LINE:37
    case controllers_HomeController_save20_route(params) =>
      call { 
        controllers_HomeController_save20_invoker.call(HomeController_1.save())
      }
  
    // @LINE:40
    case controllers_HomeController_edit21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_edit21_invoker.call(HomeController_1.edit(id))
      }
  
    // @LINE:41
    case controllers_HomeController_update22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_update22_invoker.call(HomeController_1.update(id))
      }
  
    // @LINE:44
    case controllers_HomeController_delete23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete23_invoker.call(HomeController_1.delete(id))
      }
  
    // @LINE:47
    case controllers_Assets_at24_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at24_invoker.call(Assets_4.at(path, file))
      }
  }
}
