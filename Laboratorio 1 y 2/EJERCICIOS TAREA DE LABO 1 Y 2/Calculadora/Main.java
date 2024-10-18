public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(4,8);
        System.out.println("Suma: " + calc.Suma());
        System.out.println("Resta: " + calc.Resta());
        System.out.println("División: " + calc.División());
        System.out.println("Multiplicación: " + calc.Multiplicar());
    }

}
