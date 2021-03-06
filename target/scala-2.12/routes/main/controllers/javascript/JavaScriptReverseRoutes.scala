
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Bruno/projetos/timetracker/conf/routes
// @DATE:Fri Aug 11 21:04:12 BRT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:50
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseProjetoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def formularioDeNovoProjeto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjetoController.formularioDeNovoProjeto",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projeto/novo"})
        }
      """
    )
  
    // @LINE:20
    def modalDeNovoProjeto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjetoController.modalDeNovoProjeto",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projeto/novo"})
        }
      """
    )
  
    // @LINE:21
    def salvaNovoProjeto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjetoController.salvaNovoProjeto",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projeto/novo"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseTipoTarefaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def formularioDeNovoTipoTarefa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoTarefaController.formularioDeNovoTipoTarefa",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tipotarefa/novo"})
        }
      """
    )
  
    // @LINE:27
    def salvaNovoTipoTarefa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TipoTarefaController.salvaNovoTipoTarefa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tipotarefa/novo"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseTarefaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def salvaNovaTarefa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TarefaController.salvaNovaTarefa",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tarefa/novo"})
        }
      """
    )
  
    // @LINE:23
    def formularioDeNovaTarefa: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TarefaController.formularioDeNovaTarefa",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tarefa/novo"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:39
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/new"})
        }
      """
    )
  
    // @LINE:43
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:44
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:36
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.list",
      """
        function(p0,s1,o2,f3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3))])})
        }
      """
    )
  
    // @LINE:40
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers"})
        }
      """
    )
  
    // @LINE:33
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:31
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseClienteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def salvaNovoCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.salvaNovoCliente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/novo"})
        }
      """
    )
  
    // @LINE:17
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.list",
      """
        function(p0,s1,o2,f3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes" + _qS([(p0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("f", f3))])})
        }
      """
    )
  
    // @LINE:15
    def formularioDeNovoCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.formularioDeNovoCliente",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cliente/novo"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def formularioDeLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:13
    def fazLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.fazLogout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:6
    def salvaNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.salvaNovoUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:7
    def confirmaUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirmaUsuario",
      """
        function(email0,codigo1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/confirma/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0)) + "/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("codigo", encodeURIComponent(codigo1))})
        }
      """
    )
  
    // @LINE:10
    def formularioDeLoginTeste: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeLoginTeste",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login_"})
        }
      """
    )
  
    // @LINE:5
    def formularioDeNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeNovoUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:8
    def painel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.painel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/painel"})
        }
      """
    )
  
    // @LINE:12
    def fazLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.fazLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
