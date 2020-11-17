package view.components.header

import react.RBuilder
import util.addText
import util.setProps
import view.components.chakra.Box
import view.components.chakra.Stack
import view.components.chakra.Text

fun RBuilder.header(page: TabName) {
    Stack {
        setProps {
            isInline = true
            spacing = "0px"
        }
        leftSideHeader()
        navBarHeader { optionalProps, children ->
            NavBarHeaderProps(page)
        }
        rightSideHeader()
    }
}

fun RBuilder.leftSideHeader() {
    Box {
        setProps {
            bg = "#E5E5E5"
            width = "100%"
            height = "88px"
            alignItems = "center"
            justifyContent = "center"
            display = "flex"
        }
        Text {
            setProps {
                fontSize = "36px"
                marginLeft = "24px"
                fontWeight = "bold"
            }
            addText("Snyder Consulting")
        }
    }
}

enum class TabName(val display: String, val route: String) {
    HOME("Home", ""),
    SERVICES("Services", "services"),
    HIRE_ME("Hire Me", "hire-me"),
    BLOG("Blog", "blog"),
    CONTACT("Contact", "contact"),
    ABOUT("About", "about")
}

fun RBuilder.rightSideHeader() {
    Box {
        setProps {
            bg = "#E5E5E5"
            width = "100%"
            height = "88px"
            alignItems = "center"
            justifyContent = "center"
            display = "flex"
        }
        Stack {
            setProps {
                spacing = "0px"
                alignItems = "flex-end"
            }
            Text {
                setProps {
                    fontSize = "24px"
                }
                addText("701.770.9530")
            }
            Text {
                setProps {
                    fontSize = "24px"
                }
                addText("andrew@snyderconsulting.tech")
            }
        }
    }
}