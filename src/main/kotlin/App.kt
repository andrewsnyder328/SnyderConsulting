import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.router.dom.hashRouter
import react.router.dom.route
import react.router.dom.switch
import view.pages.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        hashRouter {
            switch {
//                route("/services", ServicesView::class, exact = true)
                route("/hire-me", HireMeView::class, exact = true)
                route("/blog", BlogView::class, exact = true)
                route("/contact", ContactView::class, exact = true)
                route("/about", AboutView::class, exact = true)
                route("/", HomeView::class, exact = false)
            }
        }
    }
}