 class Rectangle implements Figure {
    public double SideA;
    public double SideB;
    public Rectangle (double SideA, double SideB) {
        this.SideB = SideB;
        this.SideA=SideA;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2*SideA)+(2*SideB);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area= SideA*SideB;
        return area;
    }

     @Override
     public String getType() {
         return "Rectangle";
     }
 }
