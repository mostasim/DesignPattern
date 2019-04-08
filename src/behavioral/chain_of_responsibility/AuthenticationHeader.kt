package behavioral.chain_of_responsibility

import java.lang.IllegalStateException

class AuthenticationHeader(val token: String?, var next: HeadersChain? = null) : HeadersChain {

    override fun addHeader(inputHeader: String): String {
        token ?: throw IllegalStateException("Token should be not null")
        return inputHeader + "Authorization Bearer $token\n"
            .let { next?.addHeader(it) ?: it }
    }
}