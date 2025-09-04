class Square (name: String): Shape(name) {

    var width: Double = 0.0;
    var height: Double  = 0.0;

    fun setDimensions(x: Double, y:Double){
        width = x;
        height = y;
    }

    override fun printDimensionable() {
        println("width: $width height: $height");
    }

    override fun getArea(): Double{
        return (width * height);
    }
}