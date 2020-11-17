package view.pages

import mvp.BaseState
import mvp.BaseView
import react.RBuilder
import react.RProps
import view.components.header.TabName
import view.components.header.header

class ContactView : BaseView<RProps, BaseState>() {

    override fun RBuilder.render() {
        header(TabName.CONTACT)
    }
}