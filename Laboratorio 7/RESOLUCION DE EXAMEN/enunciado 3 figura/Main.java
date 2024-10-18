public class Main {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo(3, 4, 3, 4, 5);
        FiguraGeometrica cuadrado = new Cuadrado(4);
        FiguraGeometrica pentagono = new Pentagono(5, 3.5);

        System.out.println("Triángulo - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Cuadrado - Área: " + cuadrado.calcularArea() + ", Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("Pentágono - Área: " + pentagono.calcularArea() + ", Perímetro: " + pentagono.calcularPerimetro());
    }
}
