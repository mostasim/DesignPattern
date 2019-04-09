package behavioral.visitor

interface ReportVisitable {

    fun accept(visitor: ReportVisitor)
}