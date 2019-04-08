package behavioral.chain_of_responsibility

fun main() {

    //create chain elements
    val authenticationHeader = AuthenticationHeader("123456")
    val contentTypeHeader = ContentTypeHeader("json")
    val messageBody = BodyPayLoad("Body:\n{\n\"username\"=\"Mostasim\"\n}")

    //construct chain
    authenticationHeader.next=contentTypeHeader
    contentTypeHeader.next=messageBody

    //execute chain
    val messageWithAuthentication =
            authenticationHeader.addHeader("Headers with authentication:\n")
    println(messageWithAuthentication)

    val messageWithoutAuth =
            contentTypeHeader.addHeader("Headers:\n")
    println(messageWithoutAuth)
}