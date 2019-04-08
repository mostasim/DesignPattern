package behavioral.chain_of_responsibility

class BodyPayLoad(val body: String, var next: HeadersChain? = null) : HeadersChain {

    override fun addHeader(inputHeader: String): String =
        inputHeader + "Body: $body\n"
            .let { next?.addHeader(it) ?: it }
}