public class Main {
    public static void main(String[] args) {
        Triangulo miTriangulo = new Triangulo(5, 3);
        Cuadrado miCuadrado = new Cuadrado(4);

        System.out.println("Área del triángulo: " + miTriangulo.calcularArea()); 
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea()); 
    }
}
