public class Calculadora {
    public int a;
    public int b;
    // constructores
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double Suma(){
        return a + b;
    }
    public double Resta(){
        return a - b;
    }
    public double División(){
        if (b!= 0){
            return (double) a/b;
        } else {
            return 0;
        }
    }
    public double Multiplicar(){
        return a*b;
    }
}