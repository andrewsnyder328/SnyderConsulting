package mvp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

abstract class BasePresenter {
    protected val presenterScope = CoroutineScope(Job())
}