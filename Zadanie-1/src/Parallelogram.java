 class Parallelogram implements Figure {
    public double baseSide;
    public double side;
    public double height;
    public Parallelogram (double baseSide,  double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * (baseSide + side);
        return perimeter;
    }
    @Override
    public double getArea() {
        double area = baseSide * height;
        return area;
    }

     @Override
     public String getType() {
         return "Parallelogram";
     }
 }
