package behavioral.visitor

class FixedPriceContract(val costPerYear: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) =
        visitor.visit(this)

}
