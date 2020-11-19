import kotlinx.browser.document
import kotlinx.browser.window
import react.dom.render
import view.components.chakra.CSSReset

fun main() {
    window.onload = {
        document.documentElement?.setAttribute("style", "height: 100%")
        document.body?.style?.backgroundImage = "linear-gradient(#CAD1DA, #E2EFFF)"
        render(document.getElementById("root")) {
            CSSReset {}
            child(App::class) {}
        }
    }
}
