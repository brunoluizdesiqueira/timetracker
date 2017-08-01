
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Bruno/projetos/timetracker/conf/routes
// @DATE:Mon Jul 31 22:31:08 BRT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
