public class Calculadora{

    public double Suma(double a, double b){
        return a + b;
    }
    public double Resta(double a, double b){
        return a - b;
    }
    public double Multiplicación(double a, double b){
        return a * b;
    }
    public double División(double a, double b){
        if(b!=0){
            return (double) a/b;
        } else {
            return 0;
        }
    }
}