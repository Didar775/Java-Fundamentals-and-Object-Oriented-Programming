public class Square implements TwoDimensionalShape{

    private double sideLength;

    public Square(){
        this.sideLength = 0;
    }

    public  Square(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public double getArea() {
       return Math.pow(sideLength, 2);
    }

    public double getLength() {
        return sideLength;
    }

    public void setLength(double length) {
        this.sideLength = length;
    }
}
