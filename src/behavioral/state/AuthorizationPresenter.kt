package behavioral.state

class AuthorizationPresenter {

    private var state: AuthorizationState = Unauthorized

    fun loginUser(userLogin: String){
        state=Authorized(userLogin)
    }

    fun logOutUser(){
        state=Unauthorized
    }

    val isAuthorized: Boolean
        get() = when(state){
            is Authorized -> true
            is Unauthorized -> false
        }
    val userLogin: String
        get() {
            val state = this.state
            return when(state){
                is Authorized -> state.username
                is Unauthorized -> "Unknown"
            }
        }
    override fun toString() = "User '$userLogin' is logged in: $isAuthorized"
}