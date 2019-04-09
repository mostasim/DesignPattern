package behavioral.visitor

fun main() {
    val projectAlpha = FixedPriceContract(costPerYear = 10000)
    val projectBeta = SupportContract(costPerMonth = 500)
    val projectGamma = TimeAndMaterialsContract(hours = 150, costPerHour = 10)
    val projectKappa = TimeAndMaterialsContract(hours = 50, costPerHour = 50)

    val projects = arrayOf(projectAlpha, projectBeta, projectGamma, projectKappa)

    val monthlyCostReportVisitor = MonthlyCostReportVisitor()
    projects.forEach { it.accept(monthlyCostReportVisitor) }
    println("Monthly cost: ${monthlyCostReportVisitor.monthlyCost}")

    val yearlyReportVisitor = YearlyReportVisitor()
    projects.forEach { it.accept(yearlyReportVisitor) }
    println("Yearly cost: ${yearlyReportVisitor.yearlyCost}")
}