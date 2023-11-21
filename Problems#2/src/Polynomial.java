public class Polynomial {
    public double[] coefficients;

    public Polynomial(double[] coefficients){

        this.coefficients = coefficients;

    }

    public Polynomial multiply(double value){
        double[] resultCoefficients = new double[coefficients.length];

        for (int i = 0; i <coefficients.length; i++){
            resultCoefficients[i] = coefficients[i] * value;
        }
        return new Polynomial(resultCoefficients);
    }


    public double evaluate(double x){

        double result = 0;

        for (int i = 0; i < coefficients.length; i++){
            result += coefficients[i] * Math.pow(x,i);
        }

        return result;

    }

    public Polynomial getFirstDerivative() {
        int n = coefficients.length - 1;
        double[] derivativeCoefficients = new double[n];

        for (int i = 1; i <= n; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }

        return new Polynomial(derivativeCoefficients);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            result.append(coefficients[i]);
            if (i < coefficients.length - 1) {
                result.append("x^").append(i).append(" + ");
            }
        }
        return result.toString();
    }



}
