package mvp

import kotlinx.browser.window
import react.*

open class BaseView<P : RProps, S : BaseState> : RComponent<P, S>(), IBaseView {

    override fun showProgress() {
        setState {
            loading = true
        }
    }

    override fun hideProgress() {
        setState {
            loading = false
        }
    }

    override fun showError(error: String) {
        window.alert(error)
    }

    override fun RBuilder.render() { /* no-op */
    }
}

external interface BaseState : RState {
    var loading: Boolean
}