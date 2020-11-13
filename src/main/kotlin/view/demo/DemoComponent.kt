package view.demo

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import view.components.ComponentBuilderArgs
import view.components.handler
import view.components.material_ui.Card

class DemoViewComponent : BaseView<RProps, DemoViewState>(), IDemoView {
    override fun RBuilder.render() {
        +"Hello World"
        Card {
            +"This is a card"
        }
    }
}

data class DemoViewProps(
    var pageTitle: String
) : RProps

interface DemoViewState : BaseState {
    var bgColor: String
}

fun RBuilder.demoView(block: ComponentBuilderArgs<DemoViewProps>) = child(DemoViewComponent::class) {
    this.handler(block)
}