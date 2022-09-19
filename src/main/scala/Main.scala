import point.Point

object Main extends App{
  var a = Point(2, 3)
  var b = Point(6, 6)

  println("Point a = " + a)
  println("Point b = " + b)

  println("a + b = " + (a + b))

  a.move(10, 20)
  println("Move point a by (10, 20) : " + a)

  println("Distance between a and b = " + a.distance(b))

  a.invert()
  println("Inverted a  = " + a)


}
