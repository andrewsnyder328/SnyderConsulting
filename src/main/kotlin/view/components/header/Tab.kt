package view.components.header

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import util.addText
import util.setOnClickListener
import util.setProps
import view.components.ComponentBuilderArgs
import view.components.chakra.Box
import view.components.chakra.Stack
import view.components.chakra.Text
import view.components.handler

class Tab : BaseView<TabProps, BaseState>() {

    override fun RBuilder.render() {
        Stack {
            setProps {
                cursor = "pointer"
                whiteSpace = "nowrap"
                height = "100%"
            }
            setOnClickListener {
                props.onTabChanged(props.tab)
            }
            Box {
                setProps {
                    alignItems = "center"
                    height = "100%"
                    display = "flex"
                    paddingTop = "10px"
                }
                Text {
                    addText(props.tab.display)
                }
            }
            Box {
                setProps {
                    height = "10px"
                    bg = if (props.isActive) "#DEE6F0" else "#ffffff"
                }
            }
        }
    }
}

data class TabProps(
    val isActive: Boolean,
    val tab: TabName,
    val onTabChanged: (TabName) -> Unit
) : RProps

fun RBuilder.tab(block: ComponentBuilderArgs<TabProps>? = null) = child(Tab::class) {
    block?.let {
        this.handler(it)
    }
}