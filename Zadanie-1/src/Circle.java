 class Circle implements Figure {
    public double radius;
    public double Area;
    public Circle (double radius) {
        this.radius=radius;

     }
    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    @Override
    public double getPerimeter() {
        double perimeter= Math.PI*2*radius;
        return perimeter;

    }

     @Override
     public String getType() {
         return "Circle";
     }
 }
