class Circle (name: String): Shape(name) {
    var radius: Double = 0.0;

    fun setDimensions(x: Double){
        radius = x;
    }

    override fun printDimensionable() {
        println("radius $radius");
    }

    override fun getArea(): Double{
        return (3.14 * radius * radius);
    }
}