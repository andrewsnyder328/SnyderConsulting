package view.components.header

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import react.setState
import util.setProps
import view.components.ComponentBuilderArgs
import view.components.chakra.Box
import view.components.chakra.Stack
import view.components.handler

class NavBarHeader : BaseView<RProps, NavBarHeaderState>() {

    override fun NavBarHeaderState.init() {
        selectedTab = TabName.HOME
    }

    private fun tabChanged(tab: TabName) {
        setState {
            selectedTab = tab
        }
    }

    override fun RBuilder.render() {

        Box {
            setProps {
                bg = "white"
                height = "94px"
                boxShadow = "0px 1px 4px 0px #ccb8b8"
            }
            Stack {
                setProps {
                    isInline = true
                    height = "100%"
                    alignItems = "center"
                    spacing = "32px"
                    paddingX = "64px"
                }
                TabName.values().forEach {
                    tab { optionalProps, children ->
                        TabProps(state.selectedTab == it, it, ::tabChanged)
                    }
                }
            }
        }
    }
}

data class NavBarHeaderProps(
    val empty: String? = null
) : RProps

external interface NavBarHeaderState : BaseState {
    var selectedTab: TabName
}

fun RBuilder.navBarHeader(block: ComponentBuilderArgs<NavBarHeaderProps>? = null) = child(NavBarHeader::class) {
    block?.let {
        this.handler(it)
    }
}