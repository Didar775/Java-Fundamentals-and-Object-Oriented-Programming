public class Data {
    private int count = 0;
    private double maximum = Double.MIN_VALUE;
    private double sum;

    public Data(){};

    public void add(Double number){

        count++;
        sum += number;
        maximum = Double.max(number,maximum);

    }

    public double getMaximum(){

        return maximum;
    }

    public double getAverage(){
        return count > 0 ? sum/count : 0;
    }
}
