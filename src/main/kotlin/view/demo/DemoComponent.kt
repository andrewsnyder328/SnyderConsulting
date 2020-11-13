package view.demo

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import react.dom.style
import util.addText
import util.setProps
import view.components.ComponentBuilderArgs
import view.components.chakra.Box
import view.components.chakra.Text
import view.components.handler

class DemoViewComponent : BaseView<RProps, DemoViewState>(), IDemoView {
    override fun RBuilder.render() {
        Box {
            setProps {
                bg = "gray"
                width = "100%"
                height = "60px"
                alignItems = "center"
                display = "flex"
            }
            style {
                this.setProp("background-color", "gray")
            }
            Text {
                setProps {
                    color = "white"
                    fontSize = "24px"
                    marginLeft = "24px"
                }
                addText("Snyder Consulting")
            }
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