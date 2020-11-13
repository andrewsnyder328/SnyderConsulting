import kotlinx.browser.document
import kotlinx.browser.window
import react.dom.render
import view.components.chakra.CSSReset

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            CSSReset {}
            child(App::class) {}
        }
    }
}
