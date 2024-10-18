// Clase Calculadora con métodos dividir y raizCuadrada
public class Calculadora {

    // Método para dividir dos números
    public double dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) dividendo / divisor;
    }

    // Método para calcular la raíz cuadrada de un número
    public double raizCuadrada(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Manejo de excepciones para la división
        try {
            System.out.println("División: " + calculadora.dividir(10, 2));
            System.out.println("División: " + calculadora.dividir(10, 0)); // Esto lanzará una excepción
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Manejo de excepciones para la raíz cuadrada
        try {
            System.out.println("Raíz Cuadrada: " + calculadora.raizCuadrada(16));
            System.out.println("Raíz Cuadrada: " + calculadora.raizCuadrada(-4)); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}