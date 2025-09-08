import java.util.Scanner

fun main (args: Array<String>){
    var square = Square("Square");
    var circle = Circle("Circle");
    var triangle = Triangle("Triangle");
    var equilateraltriangle = EquilateralTriangle("EquilateralTriangle");

    val scan = Scanner(System.`in`)
    println("Enter width/height of square:");
    var x:Double = scan.nextDouble();
    square.setDimensions(x,x);
    println("Enter radius of circle:");
    x = scan.nextDouble();
    circle.setDimensions(x);
    println("Enter side 1 length of triangle:");
    x = scan.nextDouble();
    println("Enter side 2 length of triangle:");
    var y:Double = scan.nextDouble();
    println("Enter side 3 length of triangle:");
    var z:Double = scan.nextDouble();
    triangle.setDimensions(x,y,z);
    println("Enter side length of equilateral triangle:");
    x = scan.nextDouble();
    equilateraltriangle.setDimensions(x);

    println("${square.name}, width: ${square.width}, height: ${square.height}, area: ${square.getArea()}");
    println("${circle.name}, radius: ${circle.radius}, area: ${circle.getArea()}");
    println("${triangle.name}, side one: ${triangle.Side_one}, side two: ${triangle.Side_two}, side three: ${triangle.Side_three}, area: ${triangle.getArea()}");
    println("${equilateraltriangle.name}, all sides: ${equilateraltriangle.Side_one}, area: ${equilateraltriangle.getArea()}");
}