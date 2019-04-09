package behavioral.visitor

class YearlyReportVisitor(var yearlyCost: Long = 0) : ReportVisitor {

    override fun visit(contract: FixedPriceContract) {
        yearlyCost += contract.costPerYear
    }

    override fun visit(contract: TimeAndMaterialsContract) {
        yearlyCost += contract.costPerHour * contract.hours
    }

    override fun visit(contract: SupportContract) {
        yearlyCost += contract.costPerMonth * 12
    }
}