public class Triangle implements TwoDimensionalShape{
    private double base;
    private double height;

    public Triangle(){};

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }


    @Override
    public double getArea() {
        return  0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}