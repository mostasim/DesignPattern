package behavioral.chain_of_responsibility

interface HeadersChain {
    fun addHeader(inputHeader: String): String
}