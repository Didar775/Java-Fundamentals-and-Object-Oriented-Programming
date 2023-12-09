public class Circle implements TwoDimensionalShape{
    private double radius;

    public Circle(){
        this.radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(radius,2);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
