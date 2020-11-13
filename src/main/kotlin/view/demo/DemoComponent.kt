package view.demo

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import util.addText
import util.setProps
import view.components.ComponentBuilderArgs
import view.components.handler
import view.components.material_ui.Box
import view.components.material_ui.Button
import view.components.material_ui.ButtonGroup

class DemoViewComponent : BaseView<RProps, DemoViewState>(), IDemoView {
    override fun RBuilder.render() {
        Box {
            setProps {
                width = "100%"
                height = "60px"
                justifyContent = "center"
            }
            addText("Snyder Consulting")

            ButtonGroup {
                Button {
                    addText("One")
                }
                Button {
                    addText("Two")
                }
                Button {
                    addText("Three")
                }
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