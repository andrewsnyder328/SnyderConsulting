package view.components

import kotlinext.js.asJsObject
import kotlinext.js.getOwnPropertyNames
import react.RBuilder
import react.RElementBuilder
import react.RProps

typealias ComponentBuilderArgs <P> = (
    optionalProps: (dynamic.() -> Unit) -> Unit,
    children: (RBuilder.() -> dynamic) -> Unit
) -> P?

fun <P : RProps> RElementBuilder<P>.handler(block: ComponentBuilderArgs<P>) {

    fun onOptionalProps(props: dynamic.() -> Unit) {
        props(this.attrs)
    }

    fun onChildren(children: RBuilder.() -> Unit) {
        children(this)
    }

    val result = block(::onOptionalProps, ::onChildren)

    result?.asJsObject()?.getOwnPropertyNames()?.forEach {
        attrs.asDynamic()[it] = result.asDynamic()[it]
    }
}