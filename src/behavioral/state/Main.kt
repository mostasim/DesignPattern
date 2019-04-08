package behavioral.state

fun main() {

    val authorizationPresenter = AuthorizationPresenter()

    authorizationPresenter.loginUser("Mostasim")
    println(authorizationPresenter)

    authorizationPresenter.logOutUser()
    println(authorizationPresenter)
}