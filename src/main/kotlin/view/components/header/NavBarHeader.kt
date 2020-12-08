package view.components.header

import kotlinx.browser.window
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

class NavBarHeader : BaseView<NavBarHeaderProps, NavBarHeaderState>() {

    override fun NavBarHeaderState.init() {
        selectedTab = TabName.HOME
    }

    override fun componentDidMount() {
        setState {
            selectedTab = props.page
        }
    }

    private fun tabChanged(tab: TabName) {
        window.location.replace("/#/${tab.route}")
    }

    override fun RBuilder.render() {

        Box {
            setProps {
                bg = "white"
                height = "94px"
                boxShadow = "0px 1px 4px 1px #ccb8b8"
                zIndex = 2
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
    val page: TabName
) : RProps

external interface NavBarHeaderState : BaseState {
    var selectedTab: TabName
}

fun RBuilder.navBarHeader(block: ComponentBuilderArgs<NavBarHeaderProps>? = null) = child(NavBarHeader::class) {
    block?.let {
        this.handler(it)
    }
}