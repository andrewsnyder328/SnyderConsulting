import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch
import view.home.HomeView

interface IdProps : RProps {
    var id: Int
}

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", HomeView::class, exact = true)
            }
        }
    }
}