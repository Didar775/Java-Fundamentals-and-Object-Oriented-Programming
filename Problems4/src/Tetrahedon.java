public class Tetrahedon implements ThreeDimensionalShape{
    private double sideLength;

    public Tetrahedon(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(sideLength,2);
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(2) / 12) * Math.pow(sideLength,3);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
