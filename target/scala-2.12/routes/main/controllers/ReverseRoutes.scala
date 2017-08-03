
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Bruno/projetos/timetracker/conf/routes
// @DATE:Wed Aug 02 20:20:46 BRT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:49
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def at(file:String): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:18
  class ReverseProjetoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def formularioDeNovoProjeto(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projeto/novo")
    }
  
    // @LINE:19
    def modalDeNovoProjeto(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projeto/novo")
    }
  
    // @LINE:20
    def salvaNovoProjeto(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "projeto/novo")
    }
  
  }

  // @LINE:25
  class ReverseTipoTarefaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def formularioDeNovoTipoTarefa(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tipotarefa/novo")
    }
  
    // @LINE:26
    def salvaNovoTipoTarefa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tipotarefa/novo")
    }
  
  }

  // @LINE:22
  class ReverseTarefaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def salvaNovaTarefa(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tarefa/novo")
    }
  
    // @LINE:22
    def formularioDeNovaTarefa(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tarefa/novo")
    }
  
  }

  // @LINE:30
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def delete(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:38
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computers/new")
    }
  
    // @LINE:42
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computers/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:43
    def update(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:35
    def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "computers" + play.core.routing.queryString(List(if(p == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("f", f)))))
    }
  
    // @LINE:39
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "computers")
    }
  
    // @LINE:32
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:30
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseClienteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def salvaNovoCliente(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cliente/novo")
    }
  
    // @LINE:15
    def formularioDeNovoCliente(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cliente/novo")
    }
  
  }

  // @LINE:5
  class ReverseUsuarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def formularioDeLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:13
    def fazLogout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:6
    def salvaNovoUsuario(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "usuario/novo")
    }
  
    // @LINE:7
    def confirmaUsuario(email:String, codigo:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuario/confirma/" + implicitly[play.api.mvc.PathBindable[String]].unbind("email", play.core.routing.dynamicString(email)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("codigo", play.core.routing.dynamicString(codigo)))
    }
  
    // @LINE:10
    def formularioDeLoginTeste(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login_")
    }
  
    // @LINE:5
    def formularioDeNovoUsuario(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuario/novo")
    }
  
    // @LINE:8
    def painel(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuario/painel")
    }
  
    // @LINE:12
    def fazLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
