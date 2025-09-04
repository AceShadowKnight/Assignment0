import kotlin.math.sqrt

open class Triangle (name: String): Shape(name) {
    var Side_one: Double = 0.0;
    var Side_two: Double  = 0.0;
    var Side_three: Double  = 0.0;

    fun setDimensions(x: Double, y: Double, z: Double){
        Side_one = x;
        Side_two = y;
        Side_three = z;
    }

    override fun printDimensionable() {
        println("Side one: ${Side_one}, Side two: ${Side_two}, Side three: ${Side_three}");
    }

    override fun getArea(): Double{
        val perimeter = Side_one + Side_two + Side_three;
        return (sqrt(perimeter * (perimeter - Side_one) * (perimeter - Side_two) * (perimeter - Side_three)))
    }
}