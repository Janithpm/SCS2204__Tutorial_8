package point
case class Point(xCoordinate: Int, yCoordinate: Int){
  private var x = xCoordinate
  private var y = yCoordinate

  def +(that: Point) : Point = Point(x + that.x, y + that.y)

  def move(dx: Int, dy: Int) : Point = Point(x + dx, y + dy)

  def distance(that: Point): Double = scala.math.sqrt(scala.math.pow(that.y - y, 2) + scala.math.pow(that.x - x, 2))

  def invert(): Unit = {
    val temp = x
    x = y
    y = temp
  }
}

