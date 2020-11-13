package mvp

interface IBaseView {
    fun showProgress()
    fun hideProgress()
    fun showError(error: String)
}