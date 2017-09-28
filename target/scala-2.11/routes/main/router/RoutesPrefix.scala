
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/roy/ws/playapp/donkey/conf/routes
// @DATE:Tue Sep 26 13:42:00 EDT 2017


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
