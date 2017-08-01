
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Bruno/projetos/timetracker/conf/routes
// @DATE:Mon Jul 31 22:31:08 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProjetoController ProjetoController = new controllers.ReverseProjetoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTipoTarefaController TipoTarefaController = new controllers.ReverseTipoTarefaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTarefaController TarefaController = new controllers.ReverseTarefaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseClienteController ClienteController = new controllers.ReverseClienteController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsuarioController UsuarioController = new controllers.ReverseUsuarioController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProjetoController ProjetoController = new controllers.javascript.ReverseProjetoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTipoTarefaController TipoTarefaController = new controllers.javascript.ReverseTipoTarefaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTarefaController TarefaController = new controllers.javascript.ReverseTarefaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseClienteController ClienteController = new controllers.javascript.ReverseClienteController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsuarioController UsuarioController = new controllers.javascript.ReverseUsuarioController(RoutesPrefix.byNamePrefix());
  }

}
