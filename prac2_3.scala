object TicketPriceOptimizer {
  // Constants
  val baseAttendance = 120
  val baseTicketPrice = 15.0
  val attendanceIncrease = 20
  val costPerPerformance = 500
  val costPerAttendee = 3.0

  // Calculate attendance based on ticket price
  def calculateAttendance(ticketPrice: Double): Int = {
    if (ticketPrice == baseTicketPrice) baseAttendance
    else if (ticketPrice < baseTicketPrice) baseAttendance + attendanceIncrease
    else baseAttendance - attendanceIncrease
  }

  // Calculate profit based on ticket price
  def calculateProfit(ticketPrice: Double): Double = {
    val attendance = calculateAttendance(ticketPrice)
    val revenue = attendance * ticketPrice
    val totalCost = costPerPerformance + attendance * costPerAttendee
    revenue - totalCost
  }

  // Find the best ticket price
  def findBestTicketPrice(): Double = {
    val candidatePrices = Seq(baseTicketPrice - 5, baseTicketPrice, baseTicketPrice + 5)
    candidatePrices.maxBy(calculateProfit)
  }

  def main(args: Array[String]): Unit = {
    val bestPrice = findBestTicketPrice()
    println(s"The best ticket price for maximum profit: Rs. $bestPrice")
  }
}
