import kotlinx.browser.document
import kotlinx.browser.window
import react.dom.render
import view.components.chakra.CSSReset

fun main() {
    window.onload = {
//        document.body?.style?.height = "100vh"
        document.body?.style?.background = "linear-gradient(#CAD1DA, #E2EFFF) no-repeat center fixed"
        render(document.getElementById("root")) {
            CSSReset {}
            child(App::class) {}
        }
    }
}