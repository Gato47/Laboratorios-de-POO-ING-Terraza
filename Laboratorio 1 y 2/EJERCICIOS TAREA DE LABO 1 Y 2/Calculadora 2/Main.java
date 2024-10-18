public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("---------------------------------------------");
        System.out.println("Suma: " + calc.Suma(4,2));
        System.out.println("Resta: " + calc.Resta(8,3));
        System.out.println("Multiplicacíon:" + calc.Multiplicación(7,7));
        System.out.println("División: " + calc.División(6, 0));
        System.out.println("División: " + calc.División(9, 3));
        System.out.println("---------------------------------------------");
    }
    
}
