object SalaryCalculator {
  // Constants for rates
  val normalRate: Double = 250.0
  val otRate: Double = 85.0
  val taxRate: Double = 0.12

  // Calculate gross pay (before tax)
  def calculateGrossPay(normalHours: Int, otHours: Int): Double = {
    val normalPay = normalHours * normalRate
    val otPay = otHours * otRate
    normalPay + otPay
  }

  // Calculate net pay (after tax)
  def calculateNetPay(normalHours: Int, otHours: Int): Double = {
    val grossPay = calculateGrossPay(normalHours, otHours)
    val taxAmount = grossPay * taxRate
    grossPay - taxAmount
  }

  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30

    val netPay = calculateNetPay(normalHours, otHours)
    println(s"Net pay after tax: Rs. $netPay")
  }
}
