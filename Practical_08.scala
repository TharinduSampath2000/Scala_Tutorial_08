object test extends App{

    case class Point(var x: Int, var y: Int){

        def +(that: Point) : Point = Point(x + that.x, y + that.y)

        def move(dx: Int, dy: Int) : Unit = {
            x = x + dx
            y = y + dy
        }

        def distance(that: Point): Double = scala.math.sqrt(scala.math.pow(that.y - y, 2) + scala.math.pow(that.x - x, 2))

        def invert(): Unit = {
            val temp = x
            x = y
            y = temp
        }
    }



    var a = Point(1, 5)
    var b = Point(4, 2)

    println("Point a = " + a)
    println("Point b = " + b)

    println("\na + b = " + (a + b))

    a.move(1, 2)
    println("\nMove point a by (10, 20) : " + a)

    println("\nDistance between a and b = " + a.distance(b))

    a.invert()
    println("\nInverted a  = " + a)
}