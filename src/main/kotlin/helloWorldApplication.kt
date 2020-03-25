import io.javalin.Javalin
import io.javalin.http.Context

object HelloWorld {
    @JvmStatic
    fun main(args: Array<String>) {
        val app = Javalin.create().start(8080)
        app["/", { ctx: Context -> ctx.result("{\"text\": $text, \"color\": \"#a83232\"}") }]
    }
}