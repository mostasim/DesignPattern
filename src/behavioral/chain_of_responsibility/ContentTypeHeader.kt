package behavioral.chain_of_responsibility

class ContentTypeHeader(val contentType: String, var next: HeadersChain? = null) : HeadersChain {

    override fun addHeader(inputHeader: String): String =
        inputHeader + "ContentType: $contentType\n"
            .let { next?.addHeader(it) ?: it }
}