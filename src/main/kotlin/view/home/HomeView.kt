package view.home

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import view.components.ComponentBuilderArgs
import view.components.handler
import view.components.header.header

class HomeView : BaseView<RProps, DemoViewState>(), IHomeView {

    private val presenter = HomePresenter(this)

    override fun RBuilder.render() {
        header()
    }
}

data class DemoViewProps(
    var pageTitle: String
) : RProps

interface DemoViewState : BaseState {
    var bgColor: String
}

fun RBuilder.demoView(block: ComponentBuilderArgs<DemoViewProps>) = child(HomeView::class) {
    this.handler(block)
}