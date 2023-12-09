public class Sphere implements ThreeDimensionalShape{

    private  double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return getArea() * radius / 3;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
